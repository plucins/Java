package linieLotnicze.lufthansa;

import linieLotnicze.interfaces.IFlightsData;
import linieLotnicze.model.Flight;

import java.util.List;

public class LufthansaAdapter implements IFlightsData {
    private LufthansaFlightsController controller;

    public LufthansaAdapter(LufthansaFlightsController controller) {
        this.controller = controller;
    }


    @Override
    public List<Flight> getFlights() {
        return controller.getFlights();
    }
}
