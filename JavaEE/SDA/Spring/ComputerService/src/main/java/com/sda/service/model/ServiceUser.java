package com.sda.service.model;

import com.sda.service.model.dto.user.RegisterUserDto;

import javax.persistence.*;
import java.util.List;

@Entity
public class ServiceUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private String address;
    @OneToMany
    private List<Computer> computers;

    public ServiceUser() {
    }

    public ServiceUser(String name, String lastName, String email, String password, String address, List<Computer> computers) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.address = address;
        this.computers = computers;
    }

    public ServiceUser(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public static ServiceUser registerUser(RegisterUserDto dto){
        return new ServiceUser(dto.getEmail(),dto.getPassword());
    }

    public void addComputer(Computer c){
        this.computers.add(c);
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Computer> getComputers() {
        return computers;
    }

    public void setComputers(List<Computer> computers) {
        this.computers = computers;
    }
}
