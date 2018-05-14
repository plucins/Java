package restauracja.zdarzenia;

import restauracja.EventDispatcher;
import restauracja.interfejsy.IPowiadamianyOPrzybyciuKlienta;

import java.util.List;

public class KlientpRzyszedl implements IEvent {
    private String imieKlienta;

    public KlientpRzyszedl(String imieKlienta) {
        this.imieKlienta = imieKlienta;
    }

    @Override
    public void execute() {
            List<IPowiadamianyOPrzybyciuKlienta> powitanie =  EventDispatcher.getInstance().
                    pobierzObiektyImplementujaceInterface(IPowiadamianyOPrzybyciuKlienta.class);

            for(IPowiadamianyOPrzybyciuKlienta p: powitanie){
                p.przybylKlient(imieKlienta);
            }

    }
}
