package com.kodilla.good.patterns.challenges.FlightStream;

import java.util.List;
import java.util.stream.Collectors;

public class FlightsEngine {

    public List<Flights> findFlightFrom(String flyFrom) {
        FlightsList flightsList = new FlightsList();
        List<Flights> result = flightsList.getFlightsList().stream()
                .filter(flights -> flights.getFlyFrom().equals(flyFrom))
                .collect(Collectors.toList());
        return result;
    }

    public List<Flights> findFlightTo(String flyTo) {
        FlightsList flightsList = new FlightsList();
        List<Flights> result = flightsList.getFlightsList().stream()
                .filter(flights -> flights.getFlyTo().equals(flyTo))
                .collect(Collectors.toList());
        return result;
    }
}