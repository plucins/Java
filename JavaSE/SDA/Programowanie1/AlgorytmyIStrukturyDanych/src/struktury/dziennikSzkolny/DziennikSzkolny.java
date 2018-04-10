package struktury.dziennikSzkolny;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DziennikSzkolny {

    private Map<String,DaneStudenta> daneStudentaMap = new HashMap<>();
    private Map<String,OcenyStudenta> ocenyStudentaMap = new HashMap<>();

    public void dodajStudenta(String numerIndexu, String imie, String nazwisko){
        daneStudentaMap.put(numerIndexu,new DaneStudenta(imie,nazwisko,numerIndexu));
    }

    public void dodajOceneDlaStudenta(String nrIndexu, Przedmiot przedmiot, Double ocena){
        ocenyStudentaMap.get(nrIndexu).getOcenyStudenta().get(przedmiot).add(ocena);
    }

    public void sredniaStudenta(String nrIndexu){
        for(List<Double> o: ocenyStudentaMap.get(nrIndexu).getOcenyStudenta().values()){
            int suma = 0;
            for(int i = 0; i < o.size(); i++){
                suma += o.get(i);
            }
            System.out.println("Srednia dla przedmiotu " + suma/o.size());
        }
    }
}
