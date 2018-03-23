package abstrakcja;

public class Prostokat extends Czworokat {
    protected double bokA;
    protected double bokB;

    public Prostokat(double a, double b) {
        super(a, b,a,b);
        this.bokA = a;
        this.bokB = b;
    }

    @Override
    public double obliczPole() {
        return bokA * bokB;
    }
}
