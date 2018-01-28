package com.kodilla.good.patterns.challenges.FlightStream;

import java.util.List;

public class App {

    public static void main(String[] args) throws java.lang.Exception {
        String flyFrom = "Wroclaw";
        String flyTo = "Warszawa";

        FlightsEngine flightsEngine = new FlightsEngine();

        System.out.println("Flights from " + flyFrom + ":");
        List<Flights> flightFromWro = flightsEngine.findFlightFrom(flyFrom);
        flightsEngine.printLnFlights(flightFromWro);

        System.out.println("\n");
        System.out.println("Flights to " + flyTo + ":");
        List<Flights> flightToWwa = flightsEngine.findFlightTo(flyTo);
        flightsEngine.printLnFlights(flightToWwa);
    }
}
