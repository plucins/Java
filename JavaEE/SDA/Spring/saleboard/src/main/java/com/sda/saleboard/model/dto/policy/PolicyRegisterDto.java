package com.sda.saleboard.model.dto.policy;

import com.sda.saleboard.model.Customer;
import com.sda.saleboard.model.Policy;
import com.sda.saleboard.model.dto.seller.BasicSellerDto;

import java.time.LocalDate;

public class PolicyRegisterDto {
    private Long id;
    private double policyValue;
    private String policyNumber;
    private String incomeSource;
    private String brand;
    private LocalDate saleDate;
    private String extraInfo;
    private Customer customer;
    private BasicSellerDto seller;

    public PolicyRegisterDto() {
    }

    public PolicyRegisterDto(Long id, double policyValue, String policyNumber, String incomeSource, String brand, LocalDate saleDate, String extraInfo, Customer customer, BasicSellerDto seller) {
        this.id = id;
        this.policyValue = policyValue;
        this.policyNumber = policyNumber;
        this.incomeSource = incomeSource;
        this.saleDate = saleDate;
        this.extraInfo = extraInfo;
        this.customer = customer;
        this.seller = seller;
        this.brand = brand;
    }

    public static PolicyRegisterDto create(Policy policy) {
        return new PolicyRegisterDto(policy.getId(), policy.getPolicyValue(), policy.getPolicyNumber(), policy.getIncomeSource(), policy.getBrand()
                , policy.getSaleDate(), policy.getExtraInfo(), policy.getCustomer(), BasicSellerDto.create(policy.getSeller()));
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDate saleDate) {
        this.saleDate = saleDate;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }
}
