package com.sda.saleboard.model.dto.seller;

public class RegisterSellerDto {
    private String email;
    private String password;

    public RegisterSellerDto() {
    }

    public RegisterSellerDto(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
