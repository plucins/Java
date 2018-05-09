package zadanie3.strategy;

import zadanie3.CarType;

public class CarTurbo implements CarType {

    public double zwiekszZuzycieSilnika() {
        return 0.1;
    }

    public double zwiekszgasReleased() {
        return 0.05;
    }

    public double zwiekszPredkosc() {
        return 10;
    }

    public double zwiekszZuzycieHamulcow() {
        return 0.1;
    }

    public double zmniejszPredkosc() {
        return -10;
    }
}
