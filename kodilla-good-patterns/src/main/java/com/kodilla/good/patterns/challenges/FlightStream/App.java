package com.kodilla.good.patterns.challenges.FlightStream;

import java.util.Set;

public class App {

    public static void main(String[] args) throws java.lang.Exception {
        String flyFrom = "Wroclaw";
        String flyTo = "Warszawa";
        String flyBy = "Katowice";

        FlightsEngine flightsEngine = new FlightsEngine();

        System.out.println("Flights from [" + flyFrom + "]:");
        Set<Flights> flightsFrom = flightsEngine.findFlightFrom(flyFrom);
        System.out.println(flightsFrom);

        System.out.println("\n");
        System.out.println("Flights to [" + flyTo + "]:");
        Set<Flights> flightTo = flightsEngine.findFlightTo(flyTo);
        System.out.println(flightTo);

        System.out.println("\n");
        System.out.println("Flights from [" + flyFrom + "] to [" + flyTo + "] with change in [" + flyBy + "]:");
        Set<Flights> flightsFromToBy = flightsEngine.findFlightWithChange(flyFrom, flyTo, flyBy);
        System.out.println(flightsFromToBy);
    }
}
