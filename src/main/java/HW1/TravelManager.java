package HW1;
import HW1.airline.Airline;
import HW1.airport.Airport;
import HW1.exception.BadParameterException;
import HW1.exception.NullParameterException;
import HW1.flight.CommercialFlight;
import HW1.flight.Flight;
import HW1.flight.FlightFactory;

import java.util.Optional;

public class TravelManager {

    public static void main(String[] args) throws Exception {
       Flight flight1 = FlightFactory.getAirline("ORD");
       Flight flight2 = FlightFactory.getAirline("Spirit");
    }

}

/*
OLD PATTERN

public class TravelManager {

    public static void main(String[] args) throws Exception {
        try {
            Airline airline = new Airline("Spirit");
            Airport origin = new Airport("ORD");
            Airport destination = new Airport("DFW");

            String flightNumber = FlightManager.getInstance().createFlight("commercialFlight", airline, origin, destination);
            Optional<Flight> flight = FlightManager.getInstance().getFlightByFlightNumber(flightNumber);

            System.out.println(flight.get());
        } catch (NullParameterException ex) {
            ex.printStackTrace();
        } catch (BadParameterException ex) {
            ex.printStackTrace();
        }
    }

}
 */