package HW1.airline;
import HW1.exception.BadParameterException;
import HW1.exception.NullParameterException;
import java.util.HashMap;
import java.util.Map;

public class AirlineFactory {

    private static Map<String, Airline> airlines = new HashMap<>();

    public static Airline getAirline(String airlineName) {
        return airlines.computeIfAbsent(airlineName, (an) -> {
            try {
                return new Airline(an);
            } catch (NullParameterException | BadParameterException e) {
                e.printStackTrace();
            }

            return null;
        });
    }
}