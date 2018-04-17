import java.util.*;

public class Stol {
    private List<Gracz> gracze = new ArrayList<>();
    private Map<String, Karta> kartyNaStole = new HashMap<>();

    public void addGamer(Gracz g){
        gracze.add(g);
    }

    public void putCardOnTable(Karta k, Gracz g){
        kartyNaStole.put(g.getImie(),k);
    }

    public void shereOut() {
        if(gracze.size() < 2) {
            System.out.println("Zbyt mała liczba graczy");
            return;
        }
        List<Karta> karty = new Karta().getAllCards();
        int licznik = 0;
        while (licznik <= 51) {
            for (Gracz g : gracze) {
                g.pickCard(karty.get(licznik++));
            }
        }
    }

    public void getOneCardFromPlayer(){
        for(Gracz g: gracze){
            kartyNaStole.put(g.getImie(),g.getCard());
        }
    }

    public Long checkWinenr(){
        return kartyNaStole.
    }

}
