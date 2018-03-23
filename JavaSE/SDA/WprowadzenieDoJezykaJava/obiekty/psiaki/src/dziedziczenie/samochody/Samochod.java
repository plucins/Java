package dziedziczenie.samochody;

public class Samochod {
    protected int predkosc;
    protected boolean czySwiatlaWlaczone;
    protected String kolor;
    protected Marka marka;
    protected int rocznik;


    public Samochod(String kolor, Marka marka, int rocznik) {
        this.kolor = kolor;
        this.marka = marka;
        this.rocznik = rocznik;
    }

    public int getPredkosc() {
        return predkosc;
    }

    public int przyspiesz(int predkoscMax){
        if(this.predkosc < predkoscMax){
            this.predkosc += 10;
            System.out.println("Przyspieszam do " + this.predkosc);
        } else {
            System.out.println("Osiągnięto prędkość maksymalna");
            this.predkosc = predkoscMax;
            return this.predkosc;
        }
        return predkosc;
    }

    public void wlaczSwiatla(){
        if(czySwiatlaWlaczone){
            System.out.println("Swiatła już włączone");
        }else {
            System.out.println("Włączam światła");
            czySwiatlaWlaczone = true;
        }
    }

    @Override
    public String toString() {
        return String.format("%s samochod marki %s rocznik %d",kolor,marka,rocznik);
    }
}
