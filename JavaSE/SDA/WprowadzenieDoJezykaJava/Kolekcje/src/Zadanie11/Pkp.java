package Zadanie11;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Pkp {
    List<Pociag> pociags;

    public void wszystkiePociagi(){
        pociags.stream().forEach(System.out::println);
    }

    public void wszystkieEkonomiczne(){
        pociags.stream().filter(u -> u.getKlasaPociagu() == KlasaPociagu.EKONIMIA)
                .forEach(System.out::println);
    }

    public Optional<Pociag> najbardziejOpozniony(){
        return pociags.stream().sorted(Comparator.comparingInt(Pociag::getMaxOpoznienie)).findFirst();
    }
}

