package restauracja.zdarzenia;

import restauracja.EventDispatcher;
import restauracja.interfejsy.IPowiadamialnyOZamowieniu;

import java.util.ArrayList;
import java.util.List;

public class KlientZamowil implements IEvent {
    private String imie;

    public KlientZamowil(String imie) {
        this.imie = imie;
    }

    @Override
    public void execute() {
        List<IPowiadamialnyOZamowieniu> powitanie =  EventDispatcher.getInstance().
                pobierzObiektyImplementujaceInterface(IPowiadamialnyOZamowieniu.class);

        for(IPowiadamialnyOZamowieniu p: powitanie){
            p.klientZlozylZamowienie(imie,new ArrayList<String>());
        }
    }
}
