package HW1.airline;
import HW1.exception.BadParameterException;
import HW1.exception.NullParameterException;

import java.util.Objects;

public class Airline {

    private String name;

    private static Map<Color, Vehicle>
            AirlineCache = new HashMap<>();

    public static Airline createVehicle(String name) {
        Airline newAirline = AirlineCache.computeIfAbsent(name -> {
            return new Car(newEngine, newColor);
        });
        return newAirline;
    }

    public Airline(String name) throws NullParameterException, BadParameterException {
        setName(name);
    }

    private String getName() {
        return name;
    }

    private void setName(String name) throws NullParameterException, BadParameterException {
        if (name == null) {
            throw new NullParameterException("Airline name cannot be null.");
        }

        if (name.length() > 8) {
            throw new BadParameterException("Invalid name.");
        }

        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return Objects.equals(name, airline.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Airline{" +
                "name='" + getName() + '\'' +
                '}';
    }
}