package restauracja.model;

import restauracja.interfejsy.IPowiadamialnyOWyjsciu;
import restauracja.interfejsy.IPowiadamialnyOZamowieniu;
import restauracja.interfejsy.IPowiadamianyOPrzybyciuKlienta;

import java.util.List;

public class Kelner extends AbstractRegistrable implements IPowiadamianyOPrzybyciuKlienta, IPowiadamialnyOZamowieniu, IPowiadamialnyOWyjsciu {
    private String imie;

    public Kelner(String imie) {
        this.imie = imie;
    }

    @Override
    public void klientWyszedl(String imie) {
        System.out.println(this.imie = "wie, że wyszedl " + imie);
    }

    @Override
    public void klientZlozylZamowienie(String imie, List<String> zamowienie) {
        System.out.println(this.imie +" ");
    }

    @Override
    public void przybylKlient(String imie) {
        System.out.println(this.imie + " kelner wie o kliencie " + imie);
    }
}
