package com.sda.todotask.demo.model.dto.user;

import com.sda.todotask.demo.model.AppUser;

public class ListUserDto {
    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private String address;

    public ListUserDto() {
    }

    public ListUserDto(Long id, String email, String firstName, String lastName, String address) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public static ListUserDto createDto(AppUser user){
        return new ListUserDto(user.getId(),user.getEmail(),user.getFirstName(),user.getLastName(),user.getAdress());
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
