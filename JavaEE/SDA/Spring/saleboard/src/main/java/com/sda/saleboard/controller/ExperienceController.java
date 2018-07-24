package com.sda.saleboard.controller;

import com.sda.saleboard.model.Experience;
import com.sda.saleboard.service.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/exp")
public class ExperienceController {

    private ExperienceService experienceService;

    @Autowired
    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @GetMapping(path = "/{userId}")
    public ResponseEntity<Experience> getUserExperience(@PathVariable("userId") int userId) {
        Optional<Experience> expByUserId = experienceService.getExpByUserId(userId);
        if(expByUserId.isPresent()){
            return ResponseEntity.ok(expByUserId.get());
        }
        return ResponseEntity.badRequest().build();
    }
}
