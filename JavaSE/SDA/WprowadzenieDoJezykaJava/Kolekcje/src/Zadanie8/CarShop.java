package Zadanie8;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private String name;
    private List<CarOffert> carOfferts = new ArrayList<>();

    public CarShop(String name, List<CarOffert> carOfferts) {
        this.name = name;
        this.carOfferts = carOfferts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CarOffert> getCarOfferts() {
        return carOfferts;
    }

    public void setCarOfferts(List<CarOffert> carOfferts) {
        this.carOfferts = carOfferts;
    }

    public void addAllCarOffers(CarOffert... carOfferts){
        for (CarOffert c : carOfferts){
            this.carOfferts.add(c);
        }
    }
}
