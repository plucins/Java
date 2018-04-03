package struktury.magazyn;

import java.time.LocalDate;
import java.util.*;

public class Magazyn {
    Map<Kategoria,List<Produkt>> produktyWkategorii = new HashMap<>();

    public Magazyn() {
        for(Kategoria k : Kategoria.values()){
            produktyWkategorii.put(k,new ArrayList<>());
        }
    }

    public void dodajProdukt(Produkt p){
        produktyWkategorii.get(p.getKategoria()).add(p);
    }

    public void usunProdukt(Produkt p){
        produktyWkategorii.get(p.getKategoria()).remove(p);
    }

    public boolean czyProduktWKategorii(Kategoria k, Produkt p){
        return produktyWkategorii.get(k).contains(p);
    }

    public void usunNieswierzeProdukty(){
        for(Kategoria k: Kategoria.values()){
            produktyWkategorii.get(k).removeIf(u -> u.getDataSpożycia().isBefore(LocalDate.now()));
        }
    }

    public Produkt najdrozszyProduktWMagazynie(){
        Produkt p = null;
        for(Kategoria k: Kategoria.values()){
            p = produktyWkategorii.get(k).stream().max(Comparator.comparingDouble(u -> u.getCena())).get();
        }
        return p;
    }
}
