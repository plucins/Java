package com.sda.saleboard.service;

import com.sda.saleboard.model.Experience;
import com.sda.saleboard.model.Policy;
import com.sda.saleboard.model.Seller;
import com.sda.saleboard.model.dto.policy.PolicyRegisterDto;
import com.sda.saleboard.repository.ExperienceRepository;
import com.sda.saleboard.repository.PolicyRepository;
import com.sda.saleboard.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExperienceService {

    private ExperienceRepository experienceRepository;
    private SellerRepository sellerRepository;
    private PolicyRepository policyRepository;

    @Autowired
    public ExperienceService(ExperienceRepository experienceRepository, SellerRepository sellerRepository, PolicyRepository policyRepository) {
        this.experienceRepository = experienceRepository;
        this.sellerRepository = sellerRepository;
        this.policyRepository = policyRepository;
    }


    private void countExp(Seller seller, PolicyRegisterDto dto) {
        Experience e = seller.getExperience();
        e.setExpTotalEarned(e.getExpTotalEarned() + new Double(dto.getPolicyValue()).longValue());

        while (isNextLvl(e)) {
            e.setExpToNextLevel(neededExpToNextLvl(e.getLevel()));
            e.setLevel(e.getLevel() + 1);
        }
        e.setPercentToNextLevel(percentToNextLevel(e));
    }

    private Long neededExpToNextLvl(Long lvl) {
        if(lvl == 1) return 1000L;

        double exponent = 1.8;
        int baseXp = 1000;

        Double d = (baseXp * (Math.pow(lvl, exponent)));
        return d.longValue();
    }

    private boolean isNextLvl(Experience e) {
        return e.getExpToNextLevel() <= e.getExpTotalEarned();
    }


    public void updateExp(Seller seller, PolicyRegisterDto dto) {
        countExp(seller, dto);
        experienceRepository.save(seller.getExperience());
    }

    public Optional<Experience> getExpByUserId(int id) {
        Optional<Seller> sellerOptional = sellerRepository.findById((long) id);
        if (sellerOptional.isPresent()) {
            return Optional.of(sellerOptional.get().getExperience());
        }
        return Optional.empty();
    }

    public void countExpInMinus(Long policyId){
        Optional<Policy> policyOptional = policyRepository.findById(policyId);

        if(policyOptional.isPresent()){
            Seller seller = sellerRepository.findByEmail(policyOptional.get().getSeller().getEmail()).get();
            Experience experience = getExpByUserId(seller.getId().intValue()).get();

            experience.setExpTotalEarned(experience.getExpTotalEarned() - (int) policyOptional.get().getPolicyValue());
            experience.setLevel(1);
            experience.setExpToNextLevel(1000);

            while (isNextLvl(experience)) {
                experience.setExpToNextLevel(neededExpToNextLvl(experience.getLevel()));
                experience.setLevel(experience.getLevel() + 1);
            }

            experience.setPercentToNextLevel(percentToNextLevel(experience));

            experienceRepository.save(experience);
        }
    }

    private double percentToNextLevel(Experience experience) {
        Long neededExpToCurrentLvl = neededExpToNextLvl(experience.getLevel() - 2);
        double expToGainToLevelUp = experience.getExpToNextLevel() - neededExpToCurrentLvl;
        double expGainedInCurrentLvl = experience.getExpTotalEarned() - neededExpToCurrentLvl;


        return round((expGainedInCurrentLvl / expToGainToLevelUp) * 100);
    }

    private double round(double value) {
        long factor = (long) Math.pow(10, 2);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
