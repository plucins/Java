package zadanie3;

import java.util.Observable;

public class NewsStation extends Observable {

    public void powiadomWiadomosci(int waga, String tresc){
        Wiadomosc wiadomosc = new Wiadomosc(waga,tresc);

        setChanged();
        notifyObservers(wiadomosc);
    }
}
