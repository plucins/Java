package ztm;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PrzystanekAutobusowy p1 = new PrzystanekAutobusowy(1);
        PrzystanekAutobusowy p2 = new PrzystanekAutobusowy(2);
        PrzystanekAutobusowy p3 = new PrzystanekAutobusowy(3);
        PrzystanekAutobusowy p4 = new PrzystanekAutobusowy(4);

        Informator i = new Informator();

        List<IPowiadamianyOAutobusie> powiadamialneObiekty = EventDispatcher.getInstance().
                pobierzObiektyImplementujaceInterface(IPowiadamianyOAutobusie.class);

        for(IPowiadamianyOAutobusie obiekcik: powiadamialneObiekty){
            obiekcik.powiadomOAutobusie(null);
        }
    }
}
