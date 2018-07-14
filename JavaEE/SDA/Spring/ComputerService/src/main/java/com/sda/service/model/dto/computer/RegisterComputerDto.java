package com.sda.service.model.dto.computer;

public class RegisterComputerDto {
    private String name;
    private String description;

    public RegisterComputerDto() {
    }

    public RegisterComputerDto(String name, String description) {
        this.name = name;
        this.description = description;
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
