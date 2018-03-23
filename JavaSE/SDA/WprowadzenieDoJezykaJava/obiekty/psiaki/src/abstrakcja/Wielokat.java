package abstrakcja;

public abstract class Wielokat extends Figura {

    @Override
    public double obliczObwod() {
        double[] boki = zwrocBoki();

        double obwod = 0;
        for( double b : boki){
            obwod =+ b;
        }

        return obwod;
    }

    protected abstract double[] zwrocBoki();
}
