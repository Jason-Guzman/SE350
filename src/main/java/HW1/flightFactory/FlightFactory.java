package HW1.flightFactory;
import HW1.airline.Airline;
import HW1.airport.Airport;
import HW1.exception.NullParameterException;
import HW1.flight.CommercialFlight;


public class FlightFactory {
    private FlightFactory(){
    }

    public static FlightFactory createFlight (String type, Airline airline, Airport origin, Airport destinations) throws NullParameterException {
      if(type == null){
          System.out.println("Please Enter Type of Flight!");
          return null;
    }
      if(type.equalsIgnoreCase("commercial")){
        return new CommercialFlight(airline, origin, destinations);
    }
      /*else if(type.equalsIgnoreCase("instructional")){
        return new instructionalFlight(Airline airline, Airport origin, Airport destination);
      }*/
      else return null;
    }

}
