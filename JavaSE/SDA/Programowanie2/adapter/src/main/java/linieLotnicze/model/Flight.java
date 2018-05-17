package linieLotnicze.model;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private String flightNumber;
    private long departureTime;
    private long arivalTime;
    private List<String> bussinesClassSeatsNumbers = new ArrayList<>();
    private List<String> economicClassSeatsNumbers = new ArrayList<>();
    private List<Passenger> passengers = new ArrayList<>();

    public Flight() {
    }

    public Flight(String flightNumber, long departureTime, long arivalTime) {
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.arivalTime = arivalTime;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public long getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(long departureTime) {
        this.departureTime = departureTime;
    }

    public long getArivalTime() {
        return arivalTime;
    }

    public void setArivalTime(long arivalTime) {
        this.arivalTime = arivalTime;
    }

    public List<String> getBussinesClassSeatsNumbers() {
        return bussinesClassSeatsNumbers;
    }

    public void setBussinesClassSeatsNumbers(List<String> bussinesClassSeatsNumbers) {
        this.bussinesClassSeatsNumbers = bussinesClassSeatsNumbers;
    }

    public List<String> getEconomicClassSeatsNumbers() {
        return economicClassSeatsNumbers;
    }

    public void setEconomicClassSeatsNumbers(List<String> economicClassSeatsNumbers) {
        this.economicClassSeatsNumbers = economicClassSeatsNumbers;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", departureTime=" + departureTime +
                ", arivalTime=" + arivalTime +
                ", bussinesClassSeatsNumbers=" + bussinesClassSeatsNumbers +
                ", economicClassSeatsNumbers=" + economicClassSeatsNumbers +
                ", passengers=" + passengers +
                '}';
    }
}
