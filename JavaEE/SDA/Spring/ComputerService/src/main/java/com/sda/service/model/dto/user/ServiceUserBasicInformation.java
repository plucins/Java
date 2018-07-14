package com.sda.service.model.dto.user;

public class ServiceUserBasicInformation {

    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String address;

    public ServiceUserBasicInformation() {
    }

    public ServiceUserBasicInformation(Long id, String name, String lastName, String email, String address) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
