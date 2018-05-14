package restauracja.model;

import restauracja.interfejsy.IPowiadamialnyOZamowieniu;

import java.util.List;

public class Kucharz extends AbstractRegistrable implements IPowiadamialnyOZamowieniu {


    @Override
    public void klientZlozylZamowienie(String imie, List<String> zamowienie) {
        System.out.println("przyszlo zamowienie od " + imie);
    }
}
