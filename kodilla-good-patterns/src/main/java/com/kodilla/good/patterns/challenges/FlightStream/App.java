package com.kodilla.good.patterns.challenges.FlightStream;

import java.util.List;

public class App {

    public static void main(String[] args) throws java.lang.Exception {
        String flyFrom = "Szczecin";
        String flyTo = "Warszawa";
        String flyChange = "Wroclaw";

        FlightsEngine flightsEngine = new FlightsEngine();

        System.out.println("Flights from [" + flyFrom + "]:");
        List<Flights> flightsFromSzn = flightsEngine.findFlightFrom(flyFrom);
        flightsEngine.printLnFlights(flightsFromSzn);

        System.out.println("\n");
        System.out.println("Flights to [" + flyTo + "]:");
        List<Flights> flightToWwa = flightsEngine.findFlightTo(flyTo);
        flightsEngine.printLnFlights(flightToWwa);

        System.out.println("\n");
        System.out.println("Flights to [" + flyTo + "] with change in [" + flyChange + "]:");
        List<Flights> flightsByWro = flightsEngine.findFlightWithChange(flyChange);
        flightsEngine.printLnFlights(flightsByWro);
    }
}
