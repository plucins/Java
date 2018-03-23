package abstrakcja;

public abstract class Czworokat extends Wielokat {

    private double[] boki;

    Czworokat(double a, double b, double c, double d){
        boki = new double[]{a,b,c,d};
    }

    @Override
    protected double[] zwrocBoki() {
        return boki;
    }
}
