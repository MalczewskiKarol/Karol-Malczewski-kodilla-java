package com.kodilla.good.patterns.challenges.FlightStream;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightsEngine {
    FlightsList flightsList = new FlightsList();

    public Set<Flights> findFlightFrom(String flyFrom) {
        Set<Flights> result = flightsList.getFlightsList().stream()
                .filter(flights -> flights.getFlyFrom().equals(flyFrom))
                .collect(Collectors.toSet());
        return result;
    }

    public Set<Flights> findFlightTo(String flyTo) {
        Set<Flights> result = flightsList.getFlightsList().stream()
                .filter(flights -> flights.getFlyTo().equals(flyTo))
                .collect(Collectors.toSet());
        return result;
    }

    public FlightsList findFlightWithChange(String flyFrom, String flyBy, String flyTo) {
        FlightsList flightsFromBy =  new FlightsList();
                flightsFromBy.getFlightsList().stream()
                .filter(flights -> flights.getFlyFrom().equals(flyFrom))
                .filter(flights -> flights.getFlyTo().equals(flyBy))
                .collect(Collectors.toSet());

        flightsFromBy = new FlightsList();
                flightsFromBy.getFlightsList().stream()
                .filter(flights -> flights.getFlyFrom().equals(flyBy))
                .filter(flights -> flights.getFlyTo().equals(flyTo))
                .collect(Collectors.toSet());
        return flightsFromBy;
    }
}