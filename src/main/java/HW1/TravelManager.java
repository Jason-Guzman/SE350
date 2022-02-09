package HW1;
import HW1.exception.BadParameterException;
import HW1.exception.NullParameterException;
import HW1.flight.CommercialFlight;
import HW1.FlightManager.FlightManager;

public class TravelManager {

    public static void main(String[] args) {
        try {
            FlightManager flight = new createFlight(airline, origin, destination);

            System.out.println(flight);
        } catch (NullParameterException ex) {
            ex.printStackTrace();
        } catch (BadParameterException ex) {
            ex.printStackTrace();
        }
    }
}