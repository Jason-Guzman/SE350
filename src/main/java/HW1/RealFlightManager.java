package HW1;
import HW1.airline.Airline;
import HW1.airport.Airport;
import HW1.flight.Flight;
import java.util.Optional;

public class RealFlightManager implements TravelManager {
    public static String flight_creation(String type, Airline airline, Airport origin, Airport destination, int passengerCapacity) throws Exception {
        System.out.println("A Flight is being created");
        String output = FlightManager.getInstance().createFlight( type, airline,  origin,  destination,passengerCapacity);
        //System.out.println(output.get());
        return output;
    }

    public static Optional<Flight> flightNumCreation(String flight_num) throws Exception {
        System.out.print("Flight Number:"+flight_num+"is being retrieved.");
        Optional<Flight> output = FlightManager.getInstance().getFlightByFlightNumber(flight_num);
        System.out.println(output.get());
        return output;
    }
}