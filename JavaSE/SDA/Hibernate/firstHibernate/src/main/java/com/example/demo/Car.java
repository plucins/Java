package com.example.demo;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marl;
    private String model;
    private double engine;
    private LocalDate year;
    private int tank;

    public Car() {
    }

    public Car(String marl, String model, double engine, LocalDate year, int tank) {
        this.marl = marl;
        this.model = model;
        this.engine = engine;
        this.year = year;
        this.tank = tank;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarl() {
        return marl;
    }

    public void setMarl(String marl) {
        this.marl = marl;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public int getTank() {
        return tank;
    }

    public void setTank(int tank) {
        this.tank = tank;
    }
}
