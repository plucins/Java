package restauracja.zdarzenia;

import restauracja.EventDispatcher;
import restauracja.interfejsy.IPowiadamialnyOWyjsciu;

import java.util.List;

public class KlienyWyszedl implements IEvent {
    private String imie;
    @Override
    public void execute() {
        List<IPowiadamialnyOWyjsciu> powitanie =  EventDispatcher.getInstance().
                pobierzObiektyImplementujaceInterface(IPowiadamialnyOWyjsciu.class);

        for(IPowiadamialnyOWyjsciu p: powitanie){
            p.klientWyszedl(imie);
        }
    }
}
