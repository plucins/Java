package com.sda.saleboard.model;

import com.sda.saleboard.model.dto.seller.RegisterSellerDto;

import javax.persistence.*;

@Entity
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    @OneToOne
    @JoinColumn(name = "experience_id")
    private Experience experience;

    public Seller() {
    }

    public Seller(String firstName, String lastName, String email, String password, Experience experience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.experience = experience;
    }

    private Seller(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public static Seller create(RegisterSellerDto dto){
        return new Seller(dto.getEmail(),dto.getPassword());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }
}
