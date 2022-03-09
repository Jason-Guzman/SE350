package HW1.flight;

import HW1.airline.Airline;
import HW1.airport.Airport;
import HW1.exception.NullParameterException;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class CommercialFlight extends Flight {

    public CommercialFlight(Airline airline, Airport origin, Airport destination) throws NullParameterException {
        super(airline, origin, destination);
    }
}