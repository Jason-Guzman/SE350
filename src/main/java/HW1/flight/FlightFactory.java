package HW1.flight;

import HW1.airline.Airline;
import HW1.airport.Airport;
import HW1.exception.NullParameterException;

public class FlightFactory {
    private FlightFactory() {
    }

    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination, int passengerCapacity) {
        try {
            if (type.equals("commercialFlight")) {
                return new CommercialFlight(airline, origin, destination);
            } else if (type.equals("passengerFlight")) {
                return new PassengerFlight(airline, origin, destination, passengerCapacity);
            }

        } catch(NullParameterException e) {
            return null;
        }

        return null;
    }
}