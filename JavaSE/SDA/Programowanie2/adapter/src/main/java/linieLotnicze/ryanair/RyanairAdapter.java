package linieLotnicze.ryanair;

import linieLotnicze.interfaces.IFlightsData;
import linieLotnicze.model.Flight;

import java.util.List;

public class RyanairAdapter implements IFlightsData {
    private RyanairFilightsController controller;

    public RyanairAdapter() {
        this.controller = new RyanairFilightsController();
    }


    @Override
    public List<Flight> getFlights() {
        return controller.getFlights();
    }
}
