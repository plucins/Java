package struktury.magazyn;

import java.time.LocalDate;
import java.util.*;

public class Magazyn {
    Map<Kategoria,List<Produkt>> produktyWkategorii = new HashMap<>();

    public void dodajProdukt(Produkt p){
        //sprawdzam czy
        if(produktyWkategorii.keySet().contains(p.getKategoria())) {
            produktyWkategorii.get(p.getKategoria()).add(p);
        }else {
            produktyWkategorii.put(p.getKategoria(),new ArrayList<>());
            produktyWkategorii.get(p.getKategoria()).add(p);
        }
    }

    public void usunProdukt(Produkt p){
        produktyWkategorii.get(p.getKategoria()).remove(p);
    }

    public boolean czyProduktWKategorii(Kategoria k, Produkt p){
        return produktyWkategorii.get(k).contains(p);
    }

    public void usunNieswierzeProdukty(){
        for(Kategoria k: produktyWkategorii.keySet()){
            produktyWkategorii.get(k).removeIf(u -> u.getDataSpożycia().isBefore(LocalDate.now()));
        }
    }

    public Produkt najdrozszyProduktWMagazynie(){
        Produkt p = new Produkt(0,LocalDate.now(),"produktTestowy",0,Kategoria.NABIAL);
        for(Kategoria k: produktyWkategorii.keySet()){
            if(p.getCena() < produktyWkategorii.get(k).stream().max(Comparator.comparingDouble(u -> u.getCena())).get().getCena())
            p = produktyWkategorii.get(k).stream().max(Comparator.comparingDouble(u -> u.getCena())).get();
        }
        return p;
    }


}
