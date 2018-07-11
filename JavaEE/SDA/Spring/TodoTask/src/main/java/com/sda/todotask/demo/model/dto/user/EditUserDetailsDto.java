package com.sda.todotask.demo.model.dto.user;

public class EditUserDetailsDto {
    private String firstName;
    private String lastName;
    private String adress;

    public EditUserDetailsDto() {
    }

    public EditUserDetailsDto(String firstName, String lastName, String adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
