package com.sda.spring.demo.model;


import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private String lastName;
    private String pesel;
    private int birthYear;
    private int birthMonth;
    private List<Computer> computerList = new ArrayList<>();


    public Client(String name, String lastName, String pesel, int birthYear, int birthMonth) {
        this.name = name;
        this.lastName = lastName;
        this.pesel = pesel;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
    }

    public Client() {
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

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public List<Computer> getComputerList() {
        return computerList;
    }

    public void setComputerList(List<Computer> computerList) {
        this.computerList = computerList;
    }
}
