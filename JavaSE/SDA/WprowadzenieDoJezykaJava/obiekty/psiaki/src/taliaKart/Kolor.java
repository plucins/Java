package taliaKart;

public enum Kolor {
    PIK('♠'),
    KIER('♥'),
    KARO('♦'),
    TREFL('♣');

    private final char kolor;

    Kolor(char kolor){
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return String.valueOf(kolor);
    }
}
