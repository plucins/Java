package comparator.Zadanie1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Osoba> osobas = new ArrayList<>();
        Osoba o1 = new Osoba("Janek","Jankowski",21);
        Osoba o2 = new Osoba("Piotrek", " Piotrowski",22);
        Osoba o3 = new Osoba("Jacek","Jackowski",11);
        Osoba o4 = new Osoba("Bartek","Bartkowski",15);
        osobas.add(o1);
        osobas.add(o2);
        osobas.add(o3);
        osobas.add(o4);

        Collections.sort(osobas, new Comparator<Osoba>() {
            @Override
            public int compare(Osoba o1, Osoba o2) {
                if(o1.getAge() > o2.getAge()){
                    return 1;
                }else if(o1.getAge() < o2.getAge()){
                    return -1;
                }
                return 0;
            }
        });
    }
}
