package com.kodilla.good.patterns.challenges.FlightStream;

import java.util.Set;

public class App {

    public static void main(String[] args) throws java.lang.Exception {
        String flyFrom = "Poznan";
        String flyTo = "Wroclaw";
        String flyBy = "Gdansk";

        FlightsEngine flightsEngine = new FlightsEngine();

        System.out.println("Flights from [" + flyFrom + "]:");
        Set<Flights> flightsFromSzn = flightsEngine.findFlightFrom(flyFrom);
        System.out.println(flightsFromSzn);

        System.out.println("\n");
        System.out.println("Flights to [" + flyTo + "]:");
        Set<Flights> flightToWwa = flightsEngine.findFlightTo(flyTo);
        System.out.println(flightToWwa);

        System.out.println("\n");
        System.out.println("Flights to [" + flyTo + "] with change in [" + flyBy + "]:");
        Set<Flights> flightsByWro = flightsEngine.findFlightWithChange(flyFrom, flyTo, flyBy);
        System.out.println(flightsByWro);
    }
}
