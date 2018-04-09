package struktury.zadanie18;

import java.util.*;

public class Ksiazka {
    private String tytul;
    private double cena;


    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytul='" + tytul + '\'' +
                ", cena=" + cena +
                '}';
    }

    public List<Map<String, String>> pobierzKsiazki() {
        List<Map<String, String>> ksiazki = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            Map<String, String> map = new HashMap<>();
            map.put("tytul", "tutul" + i);
            map.put("cena", "" + rand.nextInt(999));
            map.put("autor", "ID_" + rand.nextInt(5));
            ksiazki.add(map);
        }

        return ksiazki;
    }
}
