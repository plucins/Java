package linieLotnicze;

import linieLotnicze.lufthansa.LufthansaFlightsController;
import linieLotnicze.ryanair.RyanairFilightsController;

public class Main {
    public static void main(String[] args) {
        LufthansaFlightsController controller = new LufthansaFlightsController();
        RyanairFilightsController ryanairFilightsController = new RyanairFilightsController();

        System.out.println(ryanairFilightsController.getFlights());
    }
}
