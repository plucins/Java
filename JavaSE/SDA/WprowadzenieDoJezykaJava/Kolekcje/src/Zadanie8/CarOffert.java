package Zadanie8;

public class CarOffert {
    private Car car;
    private double boughtPrice;
    private double lettPrice;

    public CarOffert(Car car, double boughtPrice, double lettPrice) {
        this.car = car;
        this.boughtPrice = boughtPrice;
        this.lettPrice = lettPrice;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public void setBoughtPrice(double boughtPrice) {
        this.boughtPrice = boughtPrice;
    }

    public double getLettPrice() {
        return lettPrice;
    }

    public void setLettPrice(double lettPrice) {
        this.lettPrice = lettPrice;
    }
}
