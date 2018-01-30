package com.kodilla.good.patterns.challenges.FlightStream;

import java.util.Set;

public class App {

    public static void main(String[] args) throws java.lang.Exception {
        FlightsEngine flightsEngine = new FlightsEngine();

        System.out.println("Flights from: ");
        Set<Flights> flightsFrom = flightsEngine.findFlightFrom("Warszawa");
        System.out.println(flightsFrom);

        System.out.println("\n Flights to: ");
        Set<Flights> flightTo = flightsEngine.findFlightTo("Poznan");
        System.out.println(flightTo);

        System.out.println(" \n Flights with change: ");
        FlightsList flightBy = flightsEngine.findFlightWithChange("Wroclaw", "Poznan", "Warszawa");
        System.out.println(flightBy);
    }
}
