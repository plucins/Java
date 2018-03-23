package Autostrada;

import java.time.LocalDate;

public class VechicleInfo {
    private String licensePlateNumber;
    private CarType carType;
    private LocalDate hightwayEnterTime;

    public VechicleInfo(String licensePlateNumber, CarType carType, LocalDate hightwayEnterTime) {
        this.licensePlateNumber = licensePlateNumber;
        this.carType = carType;
        this.hightwayEnterTime = hightwayEnterTime;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public LocalDate getHightwayEnterTime() {
        return hightwayEnterTime;
    }

    public void setHightwayEnterTime(LocalDate hightwayEnterTime) {
        this.hightwayEnterTime = hightwayEnterTime;
    }
}
