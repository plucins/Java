import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Karta {
    private Kolor kolor;
    private Figura figura;

    public Karta() {
    }

    public Karta(Kolor kolor, Figura figura) {
        this.kolor = kolor;
        this.figura = figura;
    }

    public Figura getFigura() {
        return figura;
    }

    public void setFigura(Figura figura) {
        this.figura = figura;
    }

    List<Karta> getAllCards(){
        List<Karta> karty = new ArrayList<>();
        for(Kolor k : Kolor.values()){
            for(Figura f : Figura.values()){
                karty.add(new Karta(k,f));
            }
        }
        Collections.shuffle(karty);
        Collections.shuffle(karty);
        return karty;
    }

    @Override
    public String toString() {
        return figura + " " + kolor;
    }
}
