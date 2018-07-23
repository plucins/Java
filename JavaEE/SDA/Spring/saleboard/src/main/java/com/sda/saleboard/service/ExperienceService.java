package com.sda.saleboard.service;

import com.sda.saleboard.model.Experience;
import com.sda.saleboard.model.Seller;
import com.sda.saleboard.model.dto.policy.PolicyRegisterDto;
import com.sda.saleboard.repository.ExperienceRepository;
import com.sda.saleboard.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExperienceService {

    private ExperienceRepository experienceRepository;
    private SellerRepository sellerRepository;

    @Autowired
    public ExperienceService(ExperienceRepository experienceRepository, SellerRepository sellerRepository) {
        this.experienceRepository = experienceRepository;
        this.sellerRepository = sellerRepository;
    }


    private void countExp(Seller seller, PolicyRegisterDto dto) {
        Experience e = seller.getExperience();
        e.setExpTotalEarned(e.getExpTotalEarned() + new Double(dto.getPolicyValue()).longValue());

        while (isNextLvl(e)) {
            e.setExpToNextLevel(neededExpToNextLvl(e.getLevel()));
            e.setLevel(e.getLevel() + 1);
        }
    }

    private Long neededExpToNextLvl(Long lvl) {
        double exponent = 1.4;
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
}
