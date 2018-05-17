package linieLotnicze;

import linieLotnicze.model.Flight;

public interface IFlights {
    void readFlightNumber(String s, Flight flight);
    void readDepartureTime(String s, Flight flight);
    void readArivalTime(String s, Flight flight);
    void readBbssinesClassSeatsNumbers(String s, Flight flight);
    void readEconomicClassSeatsNumbers(String s, Flight flight);
    void readPassengers(String s, Flight flight);
}
