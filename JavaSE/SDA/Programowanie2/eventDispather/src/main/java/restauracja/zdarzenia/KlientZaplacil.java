package restauracja.zdarzenia;

import restauracja.EventDispatcher;
import restauracja.interfejsy.IPowiadamialnyOZaplacie;

import java.util.List;

public class KlientZaplacil implements IEvent {
    private String imie;

    public KlientZaplacil(String imie) {
        this.imie = imie;
    }

    @Override
    public void execute() {
        List<IPowiadamialnyOZaplacie> powitanie =  EventDispatcher.getInstance().
                pobierzObiektyImplementujaceInterface(IPowiadamialnyOZaplacie.class);

        for(IPowiadamialnyOZaplacie p: powitanie){
            p.klientZaplacil(imie);
        }
    }
}
