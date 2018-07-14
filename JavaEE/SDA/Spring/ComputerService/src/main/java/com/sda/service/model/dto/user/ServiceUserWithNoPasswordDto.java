package com.sda.service.model.dto.user;

import com.sda.service.model.Computer;
import com.sda.service.model.ServiceUser;

import java.util.List;

public class ServiceUserWithNoPasswordDto {

    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String address;
    private List<Computer> computers;

    public ServiceUserWithNoPasswordDto() {
    }

    public ServiceUserWithNoPasswordDto(Long id, String name, String lastName, String email, String address, List<Computer> computers) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.computers = computers;
    }

    public static ServiceUserWithNoPasswordDto createUser(ServiceUser serviceUser){
        return new ServiceUserWithNoPasswordDto(serviceUser.getId(),serviceUser.getName(),
                serviceUser.getLastName(),serviceUser.getEmail(),serviceUser.getAddress(),serviceUser.getComputers());
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

    public List<Computer> getComputers() {
        return computers;
    }

    public void setComputers(List<Computer> computers) {
        this.computers = computers;
    }
}
