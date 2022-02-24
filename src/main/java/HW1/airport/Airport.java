package HW1.airport;
import HW1.exception.BadParameterException;
import HW1.exception.NullParameterException;

import java.util.Objects;

public class Airport {

    private String name;

    private static Map<name>
            AirportCache = new HashMap<>();

    public static Airport CreateAirport(String name) {
        Airport newAirport = AirportCache.computeIfAbsent(name -> {
            return new Airport SetName(name);
        });
        return newAirport;
    }

    public Airport(String name) throws NullParameterException, BadParameterException {
        setName(name);
    }

    private String getName() {
        return name;
    }

    private void setName(String name) throws NullParameterException, BadParameterException {
        if (name == null) {
            throw new NullParameterException("Airport name cannot be null.");
        }

        if (name.length() != 3 || !name.equals(name.toUpperCase())) {
            throw new BadParameterException("Invalid name.");
        }

        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(name, airport.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Airport{" +
                "name='" + getName() + '\'' +
                '}';
    }
}