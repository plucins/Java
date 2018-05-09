package zadanie3.strategy;

import zadanie3.CarType;

public class CarEco implements CarType {
    public double zwiekszZuzycieSilnika() {
        return 0.01;
    }

    public double zwiekszgasReleased() {
        return 0.01;
    }

    public double zwiekszPredkosc() {
        return 3;
    }

    public double zwiekszZuzycieHamulcow() {
        return 0.01;
    }

    public double zmniejszPredkosc() {
        return -3;
    }
}
