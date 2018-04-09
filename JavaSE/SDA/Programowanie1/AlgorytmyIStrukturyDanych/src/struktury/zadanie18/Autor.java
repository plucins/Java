package struktury.zadanie18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Autor {
    private String id;
    private String imie;
    private String nazwisko;
    private List<Ksiazka> ksiazki;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public List<Ksiazka> getKsiazki() {
        return ksiazki;
    }

    public void setKsiazki(List<Ksiazka> ksiazki) {
        this.ksiazki = ksiazki;
    }

    public List<Map<String, String>> pobierzAutorow() {
        List<Map<String, String>> autorzy = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Map<String, String> map = new HashMap<>();
            map.put("id", "ID_" + i);
            map.put("imie", "imie " + i);
            map.put("nazwisko", "nazwisko " + i);
            autorzy.add(map);
        }

        return autorzy;
    }
}
