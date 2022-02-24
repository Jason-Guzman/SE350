package HW1.flight;

import HW1.airline.Airline;
import HW1.airport.Airport;
import HW1.exception.NullParameterException;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class PassengerFlight implements Flight{

    private Airline airline;
    private Airport origin;
    private Airport destination;
    private UUID flightNumber;
    private Date departureTime;
    private Integer passengerCapacity;

    public PassengerFlight(Airline airline, Airport origin, Airport destination, Integer passengerCapacity) throws NullParameterException {
        setAirline(airline);
        setOrigin(origin);
        setDestination(destination);
        setPassengerCapacity(passengerCapacity);
        setFlightNumber();
        setDepartureTime();
    }

    private void setPassengerCapacity(Integer size) throws NullParameterException {
        if (size.equals(null)) {
            throw new NullParameterException("size cannot be null.");
        }
        this.passengerCapacity = size;
    }

    private void setFlightNumber() {
        this.flightNumber = UUID.randomUUID();
    }

    private void setDepartureTime() {
        this.departureTime = new Date(2022, 05, 05, 13, 30);
    }

    private void setDestination(Airport destination) throws NullParameterException {
        if (destination == null) {
            throw new NullParameterException("Destination cannot be null.");
        }
        this.destination = destination;
    }

    private void setOrigin(Airport origin) throws NullParameterException {
        if (origin.equals(null)) {
            throw new NullParameterException("Origin cannot be null.");
        }
        this.origin = origin;
    }

    private void setAirline(Airline airline) throws NullParameterException {
        if (airline.equals(null)) {
            throw new NullParameterException(("Airline cannot be null"));
        }
        this.airline = airline;
    }

    public String getAirline() {
        return airline.toString();
    }

    public String getOrigin() {
        return origin.toString();
    }

    public String getDestination() {
        return destination.toString();
    }

    public String getFlightNumber() {
        return flightNumber.toString();
    }

    public String getDepartureTime() {
        return departureTime.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassengerFlight passengerFlight = (PassengerFlight) o;
        return Objects.equals(airline, passengerFlight.airline) &&
                Objects.equals(origin, passengerFlight.origin) &&
                Objects.equals(destination, passengerFlight.destination) &&
                Objects.equals(flightNumber, passengerFlight.flightNumber) &&
                Objects.equals(departureTime, passengerFlight.departureTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airline, origin, destination, flightNumber, departureTime, passengerCapacity);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "airline=" + getAirline() +
                ", origin=" + getOrigin() +
                ", destination=" + getDestination() +
                ", flightNumber=" + getFlightNumber() +
                ", departureTime=" + getDepartureTime() +
                '}';
    }
}
