package com.sda.saleboard.model.dto.policy;

import com.sda.saleboard.model.Customer;
import com.sda.saleboard.model.Policy;
import com.sda.saleboard.model.dto.seller.BasicSellerDto;

import java.time.LocalDateTime;

public class PolicyRegisterDto {
    private double policyValue;
    private String policyNumber;
    private String incomeSource;
    private LocalDateTime createdDate;
    private Customer customer;
    private BasicSellerDto seller;

    public PolicyRegisterDto() {
    }

    public PolicyRegisterDto(double policyValue, String policyNumber, String incomeSource, LocalDateTime createdDate, Customer customer, BasicSellerDto seller) {
        this.policyValue = policyValue;
        this.policyNumber = policyNumber;
        this.incomeSource = incomeSource;
        this.createdDate = createdDate;
        this.customer = customer;
        this.seller = seller;
    }

    public static PolicyRegisterDto create(Policy policy) {
        return new PolicyRegisterDto(policy.getPolicyValue(),policy.getPolicyNumber(),policy.getIncomeSource(),policy.getCreatedDate(),policy.getCustomer(),BasicSellerDto.create(policy.getSeller()));
    }



    public double getPolicyValue() {
        return policyValue;
    }

    public void setPolicyValue(double policyValue) {
        this.policyValue = policyValue;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getIncomeSource() {
        return incomeSource;
    }

    public void setIncomeSource(String incomeSource) {
        this.incomeSource = incomeSource;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BasicSellerDto getSeller() {
        return seller;
    }

    public void setSeller(BasicSellerDto seller) {
        this.seller = seller;
    }
}
