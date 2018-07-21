package com.sda.saleboard.model;

import com.sda.saleboard.model.dto.policy.PolicyRegisterDto;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double policyValue;
    private String policyNumber;
    private String incomeSource;
    private LocalDateTime createdDate;
    @OneToOne()
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @OneToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;

    public Policy() {
    }

    public Policy(double policyValue, String policyNumber, String incomeSource, Customer customer, Seller seller) {
        this.policyValue = policyValue;
        this.policyNumber = policyNumber;
        this.incomeSource = incomeSource;
        this.customer = customer;
        this.seller = seller;
        this.createdDate = LocalDateTime.now();
    }

    public static Policy create(PolicyRegisterDto dto, Seller seller){
        return new Policy(dto.getPolicyValue(),dto.getPolicyNumber(),dto.getIncomeSource(),dto.getCustomer(),seller);
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

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public void setIncomeSource(String incomeSource) {
        this.incomeSource = incomeSource;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
}
