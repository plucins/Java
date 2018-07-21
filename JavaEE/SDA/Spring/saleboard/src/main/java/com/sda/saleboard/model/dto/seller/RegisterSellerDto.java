package com.sda.saleboard.model.dto.seller;

import com.sda.saleboard.model.Experience;

public class RegisterSellerDto {
    private String email;
    private String password;
    private Experience experience = new Experience();

    public RegisterSellerDto() {
    }

    public RegisterSellerDto(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
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
