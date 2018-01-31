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

    public Set<Flights> findFlightWithChange(String flyFrom, String flyBy, String flyTo) {
        Set<Flights> flightsFromToBy = findFlightFrom(flyFrom).stream()
                .filter(f -> f.getFlyFrom().equals(flyBy))
                .collect(Collectors.toSet());
        Set<Flights> flightsFromByTo = findFlightFrom(flyBy).stream()
                .filter(f -> f.getFlyTo().equals(flyTo))
                .collect(Collectors.toSet());
        flightsFromToBy.addAll(flightsFromByTo);

                return flightsFromToBy;
    }
}