package zadanie3.strategy;

import zadanie3.CarType;

public class CarNormal implements CarType {

    public double zwiekszZuzycieSilnika() {
        return 0.05;
    }

    public double zwiekszgasReleased() {
        return 0.02;
    }

    public double zwiekszPredkosc() {
        return 5;
    }

    public double zwiekszZuzycieHamulcow() {
        return 0.05;
    }

    public double zmniejszPredkosc() {
        return -5;
    }
}
