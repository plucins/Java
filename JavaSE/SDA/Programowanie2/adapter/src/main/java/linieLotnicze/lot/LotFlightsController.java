package linieLotnicze.lot;

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

class LotFlightsController implements IFlightsController, IFlightsData {

    private List<Flight> flights = new ArrayList<>();

    public void loadFlightFromFile() {
        try {
            Scanner scanner = new Scanner(new File("flights_windows.txt"));
            while (scanner.hasNextLine()) {
                Flight flight = new Flight();
                String[] flightNumberAndFilePath = scanner.nextLine().split("->", 2);
                Scanner innerScanner = new Scanner(new File(flightNumberAndFilePath[1].trim()));
                while (innerScanner.hasNextLine()) {
                    readFlightNumber(innerScanner.nextLine(), flight);
                    readDepartureTime(innerScanner.nextLine(), flight);
                    readArivalTime(innerScanner.nextLine(), flight);
                    readBbssinesClassSeatsNumbers(innerScanner.nextLine(), flight);
                    readEconomicClassSeatsNumbers(innerScanner.nextLine(), flight);
                    readPassengers(innerScanner.nextLine(), flight);
                    flights.add(flight);
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void readFlightNumber(String s, Flight flight) {
        flight.setFlightNumber(s.split("=",2)[1]);
    }

    @Override
    public void readDepartureTime(String s, Flight flight) {
        flight.setDepartureTime(Long.parseLong(s.split("=")[1]));
    }

    @Override
    public void readArivalTime(String s, Flight flight) {
        flight.setArivalTime(Long.parseLong(s.split("=")[1]));
    }

    @Override
    public void readBbssinesClassSeatsNumbers(String s, Flight flight) {
        String[] splits = s.split("=")[1].split(" ");
        flight.setBussinesClassSeatsNumbers(Arrays.stream(splits).collect(Collectors.toList()));
    }

    @Override
    public void readEconomicClassSeatsNumbers(String s, Flight flight) {
        String[] splits = s.split("=")[1].split(" ");
        flight.setEconomicClassSeatsNumbers(Arrays.stream(splits).collect(Collectors.toList()));
    }

    @Override
    public void readPassengers(String s, Flight flight) {
        List<Passenger> passengers = new ArrayList<>();
        String[] splited = s.split("=");
        if(splited.length > 1) {
            String[] indywidualPerson = splited[1].split(" ");
            Arrays.stream(indywidualPerson).forEach(u -> {
                if (!u.equals("")) {
                    String[] person = u.split("/");
                    passengers.add(new Passenger(person[0], person[1], person[2]));
                }
            });
        }

        flight.setPassengers(passengers);

    }

    @Override
    public List<Flight> getFlights() {
        loadFlightFromFile();
        return flights;
    }
}
