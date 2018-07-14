package com.sda.service.model;

import com.sda.service.model.dto.computer.RegisterComputerDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Computer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    public Computer() {
    }

    public Computer(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public static Computer createComputer(RegisterComputerDto dto){
        return new Computer(dto.getName(),dto.getDescription());
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
