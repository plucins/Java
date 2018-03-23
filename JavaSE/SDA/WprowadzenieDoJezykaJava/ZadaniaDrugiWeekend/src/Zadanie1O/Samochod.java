package Zadanie1O;

public class Samochod {
    int predkosc = 0;
    String kolor;
    int rocznik;
    String marka;

    public Samochod(String kolor, int rocznik, String marka) {
        this.kolor = kolor;
        this.rocznik = rocznik;
        this.marka = marka;
    }

    protected int przyspiesz(int predkoscMax) {
        if (this.predkosc < predkoscMax) {
            this.predkosc += 20;
            System.out.println("Aktualna predkosc -> " + this.predkosc);
        } else {
            System.out.println("Osiagnieto prędkosc maksymalna");
        }

        return this.predkosc;
    }

    @Override
    public String toString() {
        return this.kolor.substring(0, 1).toUpperCase() + this.kolor.substring(1).toLowerCase() +
                " " + this.marka.toUpperCase() + " rocznik " + this.rocznik;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Samochod) {
            Samochod that = (Samochod) obj;
            if (this.kolor.equals(that.kolor) && this.marka.equals(that.marka) && this.rocznik == that.rocznik) {
                return true;
            }
        }
        return false;
    }
}
