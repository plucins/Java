package Calculable;

public class SumEquation implements ICalculable {

    private double liczba1;
    private double liczba2;

    public SumEquation(double liczba1, double liczba2) {
        this.liczba1 = liczba1;
        this.liczba2 = liczba2;
    }

    @Override
    public double calculate() {
        return this.liczba1 + this.liczba2;
    }
}
