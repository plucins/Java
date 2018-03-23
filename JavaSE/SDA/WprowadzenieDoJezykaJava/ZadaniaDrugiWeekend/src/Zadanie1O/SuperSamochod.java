package Zadanie1O;

public class SuperSamochod extends Samochod {

    public SuperSamochod(String kolor, int rocznik, String marka) {
        super(kolor, rocznik, marka);
    }

    @Override
    protected int przyspiesz(int predkoscMax) {
        return super.przyspiesz(predkoscMax);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof SuperSamochod){
            SuperSamochod that = (SuperSamochod) obj;
            if(this.kolor.equals(that.kolor) && this.marka.equals(that.marka) && this.rocznik == that.rocznik){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
