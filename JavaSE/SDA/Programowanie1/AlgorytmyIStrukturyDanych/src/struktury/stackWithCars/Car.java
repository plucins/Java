package struktury.stackWithCars;

public class Car {
    private String mark;
    private double price;
    private String licencePlateNumber;

    public Car(String mark, double price, String licencePlateNumber) {
        this.mark = mark;
        this.price = price;
        this.licencePlateNumber = licencePlateNumber;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLicencePlateNumber() {
        return licencePlateNumber;
    }

    public void setLicencePlateNumber(String licencePlateNumber) {
        this.licencePlateNumber = licencePlateNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", price=" + price +
                ", licencePlateNumber='" + licencePlateNumber + '\'' +
                '}';
    }
}
