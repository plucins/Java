package struktury.zadanie18;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Controller {
    private Map<Autor,Ksiazka> autorKsiazkaMap = new HashMap<>();

    public  void initAutorKsiazkaMap(){
        List<Map<String, String>> ksiazki = new Ksiazka().pobierzKsiazki();
        List<Map<String, String>> autorzy = new Autor().pobierzAutorow();

        for(int i = 0; i < ksiazki.size(); i++){
            for(int j = 0; j < autorzy.size(); j++){
                String idAutorZKsiazki = ksiazki.get(i).get("autor");
                if(idAutorZKsiazki.equals(autorzy.get(j).get("id"))){
                    System.out.println("Ksiazka " + ksiazki.get(i).get("tytul") + " cena " + ksiazki.get(i).get("cena")  + " Autor " + autorzy.get(j).get("imie") + " " + autorzy.get(j).get("nazwisko"));
                }
            }
        }
    }

}
