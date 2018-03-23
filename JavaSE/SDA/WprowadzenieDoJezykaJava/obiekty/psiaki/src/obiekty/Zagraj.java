package obiekty;

import java.util.Random;

public class Zagraj {
    private int liczba;

    public Zagraj(int liczba) {
        this.liczba = liczba;
    }

    public int getLiczba() {
        return liczba;
    }

    public void setLiczba(int liczba) {
        this.liczba = liczba;
    }

    public int wylosujLiczbe(int zakresDo){
        Random random = new Random();
        int liczba = random.nextInt(zakresDo);
        setLiczba(liczba);
        return liczba;
    }

    public Zagraj() {
    }
}
