package com.kodilla.good.patterns.challenges.FlightStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightsEngine {

    public List<Flights> findFlightFrom(String flyFrom) {
        FlightsList flightsList = new FlightsList();
        List<Flights> result = flightsList.getFlightsList().stream()
                .filter(flights -> flights.getFlyFrom().equals(flyFrom))
                .collect(Collectors.toCollection(ArrayList::new));
        return result;
    }

    public List<Flights> findFlightTo(String flyTo) {
        FlightsList flightsList = new FlightsList();
        List<Flights> result = flightsList.getFlightsList().stream()
                .filter(flights -> flights.getFlyTo().equals(flyTo))
                .collect(Collectors.toList());
        return result;
    }

    public void printLnFlights(List<Flights> theFlightsList) {
        for(int n = 0; n < theFlightsList.size(); n++) {
            System.out.println(theFlightsList.get(n).toString());
        }
    }
}