package Calculable;

public class PowEquation implements ICalculable {

    private double liczba1;
    private double liczba2;

    public PowEquation(double liczba1, double liczba2) {
        this.liczba1 = liczba1;
        this.liczba2 = liczba2;
    }


    @Override
    public double calculate() {
        return Math.pow(this.liczba1,this.liczba2);
    }
}
