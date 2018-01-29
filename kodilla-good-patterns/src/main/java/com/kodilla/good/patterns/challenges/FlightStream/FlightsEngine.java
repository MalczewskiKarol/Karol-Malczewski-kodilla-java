package com.kodilla.good.patterns.challenges.FlightStream;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightsEngine {

    public Set<Flights> findFlightFrom(String flyFrom) {
        FlightsList flightsList = new FlightsList();
        Set<Flights> result = flightsList.getFlightsList().stream()
                .filter(flights -> flights.getFlyFrom().equals(flyFrom))
                .collect(Collectors.toSet());
        return result;
    }

    public Set<Flights> findFlightTo(String flyTo) {
        FlightsList flightsList = new FlightsList();
        Set<Flights> result = flightsList.getFlightsList().stream()
                .filter(flights -> flights.getFlyTo().equals(flyTo))
                .collect(Collectors.toSet());
        return result;
    }

    public Set<Flights> findFlightWithChange(String flyFrom, String flyTo, String flyBy) throws NullPointerException {

        FlightsList flightsList = new FlightsList();

        try {
            Set<Flights> result = flightsList.getFlightsList().stream()
                    .filter(f -> f.getFlyFrom().equals(flyFrom))
                    .filter(g -> g.getFlyTo().equals(flyTo))
                    .filter(h -> h.getFlyBy().equals(flyBy))
                    .collect(Collectors.toSet());
            return result;
        } catch (Exception e) {

        }
        return null;
    }
}