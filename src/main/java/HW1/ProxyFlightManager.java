package HW1;
import HW1.airline.Airline;
import HW1.airport.Airport;
import HW1.flight.Flight;
import java.util.Optional;

public class ProxyFlightManager implements TravelManager {

    private static FlightManager realObject;

    public static String flight_creation(String type, Airline airline, Airport origin, Airport destination, int passengerCapacity) throws Exception {
        System.out.println("Invoking flight_creation");
        if (realObject == null) {
            realObject = FlightManager.getInstance();
        }
        return RealFlightManager.flight_creation( type,  airline,  origin,  destination, passengerCapacity);
    }

    public static Optional<Flight> flight_num_proxy(String flight_num) throws Exception {
        System.out.println("Invoking flightNumCreation");
        if (realObject == null) {
            realObject = FlightManager.getInstance();
        }
        return RealFlightManager.flightNumCreation(flight_num);
    }


}