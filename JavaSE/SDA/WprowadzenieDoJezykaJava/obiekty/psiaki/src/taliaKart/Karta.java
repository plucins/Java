package taliaKart;

public class Karta {
    private Figura figura;
    private Kolor kolor;

    public Karta(Figura figura, Kolor kolor) {
        this.figura = figura;
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return this.kolor + " " + this.figura;
    }
}
