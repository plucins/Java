package Zadanie8;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Car {
    private CarBrand brand;
    private String name;
    private CarType type;
    private double combustion;
    private double capacity;
    private int seats;
    private double power;
    private LocalDate produceDate;
    private boolean automatGear;

    public Car(CarBrand brand, String name, CarType type, double combustion, double capacity, int seats, double power, LocalDate produceDate, boolean automatGear) {
        this.brand = brand;
        this.name = name;
        this.type = type;
        this.combustion = combustion;
        this.capacity = capacity;
        this.seats = seats;
        this.power = power;
        this.produceDate = produceDate;
        this.automatGear = automatGear;
    }

    public CarBrand getBrand() {
        return brand;
    }

    public void setBrand(CarBrand brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public double getCombustion() {
        return combustion;
    }

    public void setCombustion(double combustion) {
        this.combustion = combustion;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public LocalDate getProduceDate() {
        return produceDate;
    }

    public void setProduceDate(LocalDate produceDate) {
        this.produceDate = produceDate;
    }

    public boolean isAutomatGear() {
        return automatGear;
    }

    public void setAutomatGear(boolean automatGear) {
        this.automatGear = automatGear;
    }

    public List<Car> getAllCarsOlderThan(List<Car> cars,LocalDate date){
        return cars.stream().filter(u -> u.getProduceDate().isAfter(date))
                .collect(Collectors.toList());
    }

    public List<Car> getAllCarsWithMark(List<Car> cars, CarBrand brand){
        return cars.stream().filter(u -> u.getBrand().equals(brand))
                .collect(Collectors.toList());
    }

    public List<Car> getSortedCarsByCombustion(List<Car> cars){
        return cars.stream().sorted((u1,u2) -> Double.compare(u1.getCombustion(),u2.getCapacity()))
                .collect(Collectors.toList());
    }

    public Optional<List<Car>> asd(List<Car> cars){
        return Optional.ofNullable(cars);
    }


}
