package com.example.demo;


import javax.persistence.*;

@Entity
public class Female {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    @OneToOne(mappedBy = "female")
    private int manID;

    public Female() {
    }

    public int getManID() {
        return manID;
    }

    public void setManID(int manID) {
        this.manID = manID;
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
}
