package com.sda.saleboard.service;

import com.sda.saleboard.model.Experience;
import com.sda.saleboard.model.Seller;
import com.sda.saleboard.model.dto.seller.BasicSellerDto;
import com.sda.saleboard.model.dto.seller.LoginSellerDto;
import com.sda.saleboard.model.dto.seller.RegisterSellerDto;
import com.sda.saleboard.repository.ExperienceRepository;
import com.sda.saleboard.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SellerService {

    private SellerRepository sellerRepository;
    private ExperienceRepository experienceRepository;

    @Autowired
    public SellerService(SellerRepository sellerRepository, ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
        this.sellerRepository = sellerRepository;
    }

    public Optional<BasicSellerDto> registerSeller(RegisterSellerDto dto) {
        if (!sellerRepository.findByEmail(dto.getEmail()).isPresent()) {
            Experience e = new Experience();
            experienceRepository.save(e);
            Seller seller = Seller.create(dto);
            seller.setExperience(e);

            return Optional.of(BasicSellerDto.create(sellerRepository.save(seller)));
        }
        return Optional.empty();
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
        if (sellerOptional.isPresent()) {
            Seller seller = sellerOptional.get();
            seller.setFirstName(dto.getFirstName());
            seller.setLastName(dto.getLastName());

            return Optional.of(BasicSellerDto.create(sellerRepository.save(seller)));
        }

        return Optional.empty();
    }

    public Optional<BasicSellerDto> loginUser(LoginSellerDto dto) {
        Optional<Seller> sellerOptional = sellerRepository.findByEmail(dto.getEmail());
        if (sellerOptional.isPresent() && sellerOptional.get().getPassword().equals(dto.getPassword())) {
            return Optional.of(BasicSellerDto.create(sellerOptional.get()));
        }

        return Optional.empty();
    }

    public List<BasicSellerDto> getUsersSortedByExp() {
        return listSellers().stream()
                .sorted(Comparator.comparingLong(u -> u.getExperience().getExpTotalEarned()))
                .collect(Collectors.toList());
    }
}
