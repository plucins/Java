package linieLotnicze.lufthansa;

import linieLotnicze.interfaces.IFlightsController;
import linieLotnicze.interfaces.IFlightsData;
import linieLotnicze.model.Flight;
import linieLotnicze.model.Passenger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LufthansaFlightsController implements IFlightsController, IFlightsData {
    private List<Flight> flights = new ArrayList<>();

    private void loadFlightFromFile() {
        try {
            Scanner scanner = new Scanner(new File("Lufthansa.txt"));
            while (scanner.hasNext()) {
                String[] splitedLine = scanner.nextLine().split(";");
                Flight flight = new Flight();
                readFlightNumber(splitedLine[0], flight);
                readDepartureTime(splitedLine[1], flight);
                readArivalTime(splitedLine[2], flight);
                readBbssinesClassSeatsNumbers(splitedLine[3], flight);
                readEconomicClassSeatsNumbers(splitedLine[4], flight);
                if (splitedLine.length > 5) {
                    readPassengers(splitedLine[5], flight);
                }
                flights.add(flight);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void readFlightNumber(String s, Flight flight) {
        flight.setFlightNumber(s);
    }

    public void readDepartureTime(String s, Flight flight) {
        flight.setDepartureTime(Long.parseLong(s));
    }

    public void readArivalTime(String s, Flight flight) {
        flight.setArivalTime(Long.parseLong(s));
    }

    public void readBbssinesClassSeatsNumbers(String s, Flight flight) {
        String[] splits = s.split("%");
        flight.setBussinesClassSeatsNumbers(Arrays.stream(splits).collect(Collectors.toList()));
    }

    public void readEconomicClassSeatsNumbers(String s, Flight flight) {
        String[] splits = s.split("%");
        flight.setEconomicClassSeatsNumbers(Arrays.stream(splits).collect(Collectors.toList()));
    }

    public void readPassengers(String s, Flight flight) {
        List<Passenger> passengers = new ArrayList<>();
        String[] persons = s.split("%");

        for (String person : persons) {
            String[] personDetail = person.split("#");
            passengers.add(new Passenger(personDetail[0], personDetail[1], personDetail[2]));
        }
        flight.setPassengers(passengers);
    }

    public List<Flight> getFlights() {
        loadFlightFromFile();
        return this.flights;
    }


}
