package com.sda.saleboard.model.dto.seller;

public class LoginSellerDto {

    private String email;
    private String password;

    public LoginSellerDto() {
    }

    public LoginSellerDto(String email, String password) {
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
