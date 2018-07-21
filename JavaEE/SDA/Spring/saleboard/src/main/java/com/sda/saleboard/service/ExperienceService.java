package com.sda.saleboard.service;

import com.sda.saleboard.model.Experience;
import com.sda.saleboard.model.Seller;
import com.sda.saleboard.model.dto.policy.PolicyRegisterDto;
import com.sda.saleboard.repository.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService {

    private ExperienceRepository experienceRepository;

    @Autowired
    public ExperienceService(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }




    private void countExp(Seller seller, PolicyRegisterDto dto){
        Experience e = seller.getExperience();
        e.setExpTotalEarned(e.getExpTotalEarned() + new Double(dto.getPolicyValue()).longValue());

        while(isNextLvl(e)){
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
        countExp(seller,dto);
        experienceRepository.save(seller.getExperience());
    }
}
