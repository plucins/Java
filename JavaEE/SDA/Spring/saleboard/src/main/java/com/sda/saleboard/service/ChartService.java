package com.sda.saleboard.service;

import com.sda.saleboard.model.Policy;
import com.sda.saleboard.model.dto.chart.TotalByDateDto;
import com.sda.saleboard.repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChartService {

    private PolicyRepository policyRepository;

    @Autowired
    public ChartService(PolicyRepository policyRepository) {
        this.policyRepository = policyRepository;
    }

    public List<TotalByDateDto> getTotalByDate() {
        List<LocalDate> distinctByDate = policyRepository.findDistinctSaleDate();
        List<TotalByDateDto> total = new ArrayList<>();

        for (LocalDate ld : distinctByDate) {

            Double amount = policyRepository.findAllBySaleDateEquals(ld)
                    .stream().mapToDouble(Policy::getPolicyValue).sum();

            total.add(new TotalByDateDto(ld, amount));
        }

        return total.stream().sorted(Comparator.comparing(TotalByDateDto::getDate)).collect(Collectors.toList());

    }
}
