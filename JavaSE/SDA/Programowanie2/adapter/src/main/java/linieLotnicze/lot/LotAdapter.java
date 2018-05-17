package linieLotnicze.lot;

import linieLotnicze.interfaces.IFlightsData;
import linieLotnicze.model.Flight;

import java.util.List;

public class LotAdapter implements IFlightsData {
    LotFlightsController lotFlightsController;

    public LotAdapter() {
        this.lotFlightsController = new LotFlightsController();
    }

    @Override
    public List<Flight> getFlights() {
        return lotFlightsController.getFlights();
    }
}
