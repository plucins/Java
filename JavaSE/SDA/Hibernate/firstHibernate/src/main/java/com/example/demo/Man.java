package com.example.demo;

import javax.persistence.*;

@Entity
public class Man {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String lastName;
    @OneToOne
    @JoinColumn(name = "woman_id")
    private Female female;

    public Man() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Female getFemale() {
        return female;
    }

    public void setFemale(Female female) {
        this.female = female;
    }
}
