package Zadanie12;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class RejestrObywateli {
    Map<String, Obywatel> obywatelMap = new HashMap();

    public void dodajObywatela(String imie, String nazwisko, String pesel){
        obywatelMap.put(pesel, new Obywatel(imie, nazwisko,pesel));
    }

    public List<Obywatel> znajdzObywateliUrodzonychPrzed(int rok){
       return obywatelMap.values().stream()
               .filter(u -> parsePeselToDate(u.getPesel()).getYear() < rok)
               .collect(Collectors.toList());
    }

    public List<Obywatel> znajdźObywateliZRokuZImieniem(int rok, String imie){
        return obywatelMap.values().stream().filter(u -> parsePeselToDate(u.getPesel()).getYear() == rok)
                .filter(s -> s.getImie().equals(imie))
                .collect(Collectors.toList());
    }

    public List<Obywatel> znajdźObywatelaPoNazwisku(String nazwisko){
        return obywatelMap.values().stream().filter(u -> u.getNazwisko().equals(nazwisko))
                .collect(Collectors.toList());
    }

    public Optional<Obywatel> znajdźObywatelaPoPeselu(String pesel){
        return obywatelMap.values().stream().filter(u->u.getPesel().equals(pesel)).findFirst();
    }

    private LocalDate parsePeselToDate(String pesel){
        if(Integer.parseInt(pesel.substring(2,4)) >= 20){
            return LocalDate.of(2000+Integer.parseInt(pesel.substring(0,2)),Integer.parseInt(pesel.substring(2,4))-20,Integer.parseInt(pesel.substring(4,6)));
        }
        return LocalDate.of(1900+Integer.parseInt(pesel.substring(0,2)),Integer.parseInt(pesel.substring(2,4)),Integer.parseInt(pesel.substring(4,6)));
    }


}
