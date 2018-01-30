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

    public Set<FlightsWithChange> findFlightWithChange(String flyByWithChange) {
        FlightsListWithChange flightsListWithChange = new FlightsListWithChange();
        Set<FlightsWithChange> result = flightsListWithChange.getTheFlightsListWithChange().stream()
                .filter(f -> f.getFlyByWithChange().equals(flyByWithChange))
                .collect(Collectors.toSet());
        return result;
    }
}