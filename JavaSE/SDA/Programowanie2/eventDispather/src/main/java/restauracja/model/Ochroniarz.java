package restauracja.model;

import restauracja.interfejsy.IPowiadamialnyOWyjsciu;
import restauracja.interfejsy.IPowiadamialnyOZamowieniu;
import restauracja.interfejsy.IPowiadamialnyOZaplacie;

import java.util.ArrayList;
import java.util.List;

public class Ochroniarz extends AbstractRegistrable implements IPowiadamialnyOZamowieniu,IPowiadamialnyOWyjsciu,IPowiadamialnyOZaplacie {
    private List<String> listaImioncoNieZaplacili = new ArrayList<>();
    @Override
    public void klientWyszedl(String imie) {
        if(listaImioncoNieZaplacili.contains(imie)){
            System.out.println("Dzwonie na 997");
        }else {
            System.out.println("Nie złozył zamowneia " + imie);
        }
    }

    @Override
    public void klientZlozylZamowienie(String imie, List<String> zamowienie) {
        System.out.println("Dodanie do listy oczekujacych na platnosc" + imie);
        listaImioncoNieZaplacili.add(imie);
    }

    @Override
    public void klientZaplacil(String imie) {
        if(listaImioncoNieZaplacili.contains(imie)){
            System.out.println("Zaplacił usuwam " + imie);
            listaImioncoNieZaplacili.remove(imie);
        }
    }
}
