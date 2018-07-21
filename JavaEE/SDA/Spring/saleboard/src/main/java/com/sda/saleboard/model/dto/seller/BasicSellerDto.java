package com.sda.saleboard.model.dto.seller;

import com.sda.saleboard.model.Experience;
import com.sda.saleboard.model.Seller;

public class BasicSellerDto {
    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private Experience experience;

    public BasicSellerDto() {
    }

    public BasicSellerDto(Long id, String email, String firstName, String lastName, Experience experience) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.experience = experience;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }

    public static BasicSellerDto create(Seller seller){
        return new BasicSellerDto(seller.getId(),seller.getEmail(),seller.getFirstName(),seller.getLastName(), seller.getExperience());
    }
}
