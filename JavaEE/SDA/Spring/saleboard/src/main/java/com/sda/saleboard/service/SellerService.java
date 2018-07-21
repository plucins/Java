package com.sda.saleboard.service;

import com.sda.saleboard.model.Seller;
import com.sda.saleboard.model.dto.seller.BasicSellerDto;
import com.sda.saleboard.model.dto.seller.RegisterSellerDto;
import com.sda.saleboard.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SellerService {

    private SellerRepository sellerRepository;

    @Autowired
    public SellerService(SellerRepository sellerRepository) {
        this.sellerRepository = sellerRepository;
    }

    public BasicSellerDto registerSeller(RegisterSellerDto dto) {
        return BasicSellerDto.create(sellerRepository.save(Seller.create(dto)));
    }

    public List<BasicSellerDto> listSellers() {
        return sellerRepository.findAll().stream()
                .map(BasicSellerDto::create)
                .collect(Collectors.toList());
    }

    public boolean removeSeller(Long id) {

        if (sellerRepository.findById(id).isPresent()) {
            sellerRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Optional<BasicSellerDto> updateSeller(BasicSellerDto dto) {
        Optional<Seller> sellerOptional = sellerRepository.findById(dto.getId());
        if(sellerOptional.isPresent()){
            Seller seller = sellerOptional.get();
            seller.setFirstName(dto.getFirstName());
            seller.setLastName(dto.getLastName());

            return Optional.of(BasicSellerDto.create(sellerRepository.save(seller)));
        }

        return Optional.empty();
    }
}
