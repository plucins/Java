package com.sda.saleboard.model.dto;

import com.sda.saleboard.model.dto.seller.BasicSellerDto;

public class AuthenticationDto {
    private String token;
    private BasicSellerDto seller;

    public AuthenticationDto() {
    }

    public AuthenticationDto(String token, BasicSellerDto seller) {
        this.token = token;
        this.seller = seller;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public BasicSellerDto getSeller() {
        return seller;
    }

    public void setSeller(BasicSellerDto seller) {
        this.seller = seller;
    }
}
