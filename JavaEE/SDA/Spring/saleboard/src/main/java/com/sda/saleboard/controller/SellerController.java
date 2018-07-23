package com.sda.saleboard.controller;

import com.sda.saleboard.model.Experience;
import com.sda.saleboard.model.dto.seller.BasicSellerDto;
import com.sda.saleboard.model.dto.seller.LoginSellerDto;
import com.sda.saleboard.model.dto.seller.RegisterSellerDto;
import com.sda.saleboard.service.ExperienceService;
import com.sda.saleboard.service.SellerService;
import org.apache.tomcat.jni.Error;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/seller")
public class SellerController {

    private SellerService sellerService;
    private ExperienceService experienceService;

    @Autowired
    public SellerController(SellerService sellerService, ExperienceService experienceService) {
        this.sellerService = sellerService;
        this.experienceService = experienceService;
    }

    @PostMapping
    public ResponseEntity<?> registerSeller(@RequestBody RegisterSellerDto dto) {
        if (!dto.getPassword().equals(dto.getConfirmPassword())) {
            return new ResponseEntity<Error>(HttpStatus.CONFLICT);
        }

        Optional<BasicSellerDto> registerSeller = sellerService.registerSeller(dto);
        if (registerSeller.isPresent()) {
            return ResponseEntity.ok(registerSeller.get());
        }

        return ResponseEntity.badRequest().build();

    }

    @GetMapping
    public ResponseEntity<List<BasicSellerDto>> listSellers() {
        return ResponseEntity.ok(sellerService.listSellers());
    }

    @PutMapping
    public ResponseEntity<BasicSellerDto> updateSeller(@RequestBody BasicSellerDto dto) {
        Optional<BasicSellerDto> sellerDtoOptional = sellerService.updateSeller(dto);
        if (sellerDtoOptional.isPresent()) {
            return ResponseEntity.ok(sellerDtoOptional.get());
        }

        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity removeSeller(@PathVariable Long id) {

        return sellerService.removeSeller(id) ? ResponseEntity.ok().build() : ResponseEntity.badRequest().build();
    }

    @PostMapping("/login")
    public ResponseEntity<BasicSellerDto> loginUser(@RequestBody LoginSellerDto dto) {
        Optional<BasicSellerDto> seller = sellerService.loginUser(dto);

        if (seller.isPresent()) {
            return ResponseEntity.ok(seller.get());
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/exp")
    public ResponseEntity<Experience> getUserExperience(@PathVariable int userId) {
        Optional<Experience> expByUserId = experienceService.getExpByUserId(userId);
        if(expByUserId.isPresent()){
            return ResponseEntity.ok(expByUserId.get());
        }
        return ResponseEntity.badRequest().build();
    }


}
