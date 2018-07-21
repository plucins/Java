package com.sda.saleboard.controller;

import com.sda.saleboard.model.dto.seller.BasicSellerDto;
import com.sda.saleboard.model.dto.seller.RegisterSellerDto;
import com.sda.saleboard.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/seller")
public class SellerController {

    private SellerService sellerService;

    @Autowired
    public SellerController(SellerService sellerService) {
        this.sellerService = sellerService;
    }

    @PostMapping
    public ResponseEntity<BasicSellerDto> registerSeller(@RequestBody RegisterSellerDto dto) {
        return ResponseEntity.ok(sellerService.registerSeller(dto));

    }

    @GetMapping
    public ResponseEntity<List<BasicSellerDto>> listSellers() {
        return ResponseEntity.ok(sellerService.listSellers());
    }

    @PutMapping
    public ResponseEntity<BasicSellerDto> updateSeller(@RequestBody BasicSellerDto dto){
        Optional<BasicSellerDto> sellerDtoOptional = sellerService.updateSeller(dto);
        if(sellerDtoOptional.isPresent()){
            return ResponseEntity.ok(sellerDtoOptional.get());
        }

        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity removeSeller(@PathVariable Long id) {

        return sellerService.removeSeller(id) ? ResponseEntity.ok().build() : ResponseEntity.badRequest().build();
    }


}
