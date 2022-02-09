package HW1.FlightManager;
import java.util.*;
import HW1.flightFactory.FlightFactory;
import HW1.flight.CommercialFlight;

public class FlightManager {
    ArrayList<FlightFactory> flights = new ArrayList<>();

    private void flights (){
        flights.clear();
    }

    public void createFlight(){
        FlightFactory created_flight = new FlightFactory.createFlight();
        flights.add(created_flight);
    }

    public String getFlightByNumber(){
        for (int i = 0; i < flights.size(); i++)
            CommercialFlight.getFlightNumber(i);
    }

}
