package HW1;
import HW1.airline.Airline;
import HW1.airline.AirlineFactory;
import HW1.airport.Airport;
import HW1.airport.AirportFactory;
import HW1.flight.Flight;
import java.util.Optional;

public interface TravelManager {

    public static void main(String[] args) throws Exception {

        Airline airline = AirlineFactory.getAirline("Spirit");
        Airport origin = AirportFactory.getAirport("ORD");
        Airport destination = AirportFactory.getAirport("DFW");


        String flightNumber = ProxyFlightManager.flight_creation("commercialFlight", airline, origin, destination, 0);
        String flightNumber2 = ProxyFlightManager.flight_creation("passengerFlight", airline, origin, destination, 88);

        ProxyFlightManager.flight_num_proxy(flightNumber);
        Optional<Flight> flight2 = FlightManager.getInstance().getFlightByFlightNumber(flightNumber2);

        System.out.println(flight2.get());

    }
}
