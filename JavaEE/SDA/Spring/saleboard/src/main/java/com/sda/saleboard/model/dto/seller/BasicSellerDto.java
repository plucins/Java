package com.sda.saleboard.model.dto.seller;

import com.sda.saleboard.model.Experience;
import com.sda.saleboard.model.Seller;
import com.sda.saleboard.model.UserRole;

public class BasicSellerDto {
    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private Experience experience;
    private UserRole role;

    public BasicSellerDto() {
    }

    public BasicSellerDto(Long id, String email, String firstName, String lastName, Experience experience, UserRole role) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.experience = experience;
        this.role = role;
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

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public static BasicSellerDto create(Seller seller){
        return new BasicSellerDto(seller.getId(),seller.getEmail(),seller.getFirstName(),seller.getLastName(), seller.getExperience(),seller.getRole());
    }
}
