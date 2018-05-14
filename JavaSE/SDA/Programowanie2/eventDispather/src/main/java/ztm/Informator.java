package ztm;

import java.util.ArrayList;
import java.util.List;

public class Informator extends AbstractRegistrable implements IPowiadamianyOAutobusie {
    //lista zbiżających się autobusów
    private List<Autobusy> autobusies = new ArrayList<>();

    public Informator() {
    }

    public List<Autobusy> getAutobusies() {
        return autobusies;
    }

    public void setAutobusies(List<Autobusy> autobusies) {
        this.autobusies = autobusies;
    }

    @Override
    public void powiadomOAutobusie(Autobusy o) {
        System.out.println("Informator powiadomoiony o autobusie " + o);
    }
}
