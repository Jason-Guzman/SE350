package HW1;

import HW1.airline.Airline;
import HW1.airport.Airport;
import HW1.exception.BadParameterException;
import HW1.exception.NullParameterException;
import HW1.flight.Flight;

public class TravelManager {

    public static void main(String[] args) {
        try {
            Airline airline = new Airline("Spirit");
            Airport origin = new Airport("ORD");
            Airport destination = new Airport("DFW");

            Flight flight = new Flight(airline, origin, destination);

            System.out.println(flight);
        } catch (NullParameterException ex) {
            ex.printStackTrace();
        } catch (BadParameterException ex) {
            ex.printStackTrace();
        }
    }

}