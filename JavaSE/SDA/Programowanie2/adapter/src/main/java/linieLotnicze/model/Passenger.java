package linieLotnicze.model;

public class Passenger {
    private String lastName;
    private String reservedSeat;
    private String reservationNumber;

    public Passenger(String lastName, String reservedSeat, String reservationNumber) {
        this.lastName = lastName;
        this.reservedSeat = reservedSeat;
        this.reservationNumber = reservationNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getReservedSeat() {
        return reservedSeat;
    }

    public void setReservedSeat(String reservedSeat) {
        this.reservedSeat = reservedSeat;
    }

    public String getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(String reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "lastName='" + lastName + '\'' +
                ", reservedSeat='" + reservedSeat + '\'' +
                ", reservationNumber='" + reservationNumber + '\'' +
                '}';
    }
}
