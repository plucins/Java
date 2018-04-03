package struktury.magazyn;

import java.util.HashMap;
import java.util.Map;

public class Zarzadca {
    Map<String,Magazyn> magazynyZNazwa = new HashMap<>();

    public void dodajMagazyn(String nazwa){
        if(!magazynyZNazwa.containsKey(nazwa)){
            magazynyZNazwa.put(nazwa,new Magazyn());
        }else {
            System.out.println("Magazyn o wskazanej nazwie już istnieje");
        }
    }

    public void wyczyscMagazyn(String nazwa){
        magazynyZNazwa.remove(nazwa);
        dodajMagazyn(nazwa);
    }

    public void NajdrozszeProduktyZKazdegoMagazynu(){
        for(String nazwaMagazynu : magazynyZNazwa.keySet()){
            System.out.println("W magazynie " + nazwaMagazynu + "najdrozszy produkt to " + magazynyZNazwa.get(nazwaMagazynu).najdrozszyProduktWMagazynie());
        }
    }
}
