package com.sda.spring.demo.model;

public class Computer {
    private int id;
    private String name;
    private String brand;
    private String model;
    private double price;
    private int benchmarkPoints;

    public Computer() {
    }

    public Computer(int id, String name, String brand, String model, double price, int benchmarkPoints) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.benchmarkPoints = benchmarkPoints;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBenchmarkPoints() {
        return benchmarkPoints;
    }

    public void setBenchmarkPoints(int benchmarkPoints) {
        this.benchmarkPoints = benchmarkPoints;
    }
}
