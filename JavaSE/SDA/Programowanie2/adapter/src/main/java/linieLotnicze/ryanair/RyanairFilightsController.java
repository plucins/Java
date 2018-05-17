package linieLotnicze.ryanair;

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

public class RyanairFilightsController implements IFlightsController, IFlightsData {

    private List<Flight> flights = new ArrayList<>();

    private void loadFlightFromFile() {
        try {
            Scanner scanner = new Scanner(new File("Ryanair.txt"));
            while (scanner.hasNextLine()) {
                if (scanner.nextLine().matches("-{90}")) {
                    Flight flight = new Flight();
                    readFlightNumber(scanner.nextLine(), flight);
                    readDepartureTime(scanner.nextLine(), flight);
                    readArivalTime(scanner.nextLine(), flight);
                    readBbssinesClassSeatsNumbers(scanner.nextLine(), flight);
                    readEconomicClassSeatsNumbers(scanner.nextLine(), flight);
                    readPassengers(scanner.nextLine(), flight);
                    flights.add(flight);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void readFlightNumber(String s, Flight flight) {
        flight.setFlightNumber(s);
    }

    @Override
    public void readDepartureTime(String s, Flight flight) {
        flight.setDepartureTime(Long.parseLong(s));
    }

    @Override
    public void readArivalTime(String s, Flight flight) {
        flight.setArivalTime(Long.parseLong(s));
    }

    @Override
    public void readBbssinesClassSeatsNumbers(String s, Flight flight) {
        String[] splited = s.split(" ");
        List<String> list = new ArrayList<>(Arrays.asList(splited));
        flight.setBussinesClassSeatsNumbers(list);
    }

    @Override
    public void readEconomicClassSeatsNumbers(String s, Flight flight) {
        String[] splited = s.split(" ");
        List<String> list = new ArrayList<>(Arrays.asList(splited));
        flight.setEconomicClassSeatsNumbers(list);
    }

    @Override
    public void readPassengers(String s, Flight flight) {
        List<Passenger> passengers = new ArrayList<>();
        if (!s.equals("")) {
            String[] splited = s.split(" ");
            Arrays.stream(splited).forEach(u -> {
                String[] person = u.split(",");
                passengers.add(new Passenger(person[0], person[1], person[2]));
            });


            flight.setPassengers(passengers);
        }
    }

    public List<Flight> getFlights() {
        loadFlightFromFile();
        return flights;
    }
}
