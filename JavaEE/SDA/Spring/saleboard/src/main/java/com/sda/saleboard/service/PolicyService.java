package com.sda.saleboard.service;

import com.sda.saleboard.model.Policy;
import com.sda.saleboard.model.Seller;
import com.sda.saleboard.model.dto.policy.PolicyRegisterDto;
import com.sda.saleboard.repository.CustomerRepository;
import com.sda.saleboard.repository.PolicyRepository;
import com.sda.saleboard.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PolicyService {

    private PolicyRepository policyRepository;
    private SellerRepository sellerRepository;
    private CustomerRepository customerRepository;

    @Autowired
    public PolicyService(PolicyRepository policyRepository, SellerRepository sellerRepository,CustomerRepository customerRepository) {
        this.policyRepository = policyRepository;
        this.sellerRepository = sellerRepository;
        this.customerRepository = customerRepository;
    }

    public Optional<PolicyRegisterDto> registerPolicy(PolicyRegisterDto dto) {
        Optional<Seller> seller = sellerRepository.findByEmail(dto.getSeller().getEmail());
        if (seller.isPresent()) {
            customerRepository.save(dto.getCustomer());
            return Optional.of(PolicyRegisterDto.create(policyRepository.save(Policy.create(dto, seller.get()))));
        }
        return Optional.empty();
    }

    public List<PolicyRegisterDto> getAllPolicies() {
        return policyRepository.findAll().stream().map(PolicyRegisterDto::create)
                .collect(Collectors.toList());
    }

    public boolean removePolicy(Long id) {
        if (policyRepository.findById(id).isPresent()) {
            policyRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Optional<PolicyRegisterDto> updatePolicy(Long id, PolicyRegisterDto dto) {
        Optional<Policy> policyOptional = policyRepository.findById(id);
        if (policyOptional.isPresent()) {
            Policy policy = policyOptional.get();
            policy.setCustomer(dto.getCustomer());
            policy.setIncomeSource(dto.getIncomeSource());
            policy.setPolicyNumber(dto.getPolicyNumber());
            policy.setPolicyValue(dto.getPolicyValue());
            policy.setCustomer(dto.getCustomer());

            return Optional.of(PolicyRegisterDto.create(policyRepository.save(policy)));
        }

        return Optional.empty();
    }
}
