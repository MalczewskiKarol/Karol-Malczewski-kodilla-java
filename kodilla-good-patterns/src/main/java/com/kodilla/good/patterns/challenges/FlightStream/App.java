package com.kodilla.good.patterns.challenges.FlightStream;

public class App {

    public static void main(String[] args) throws java.lang.Exception {
        FlightsEngine flightsEngine = new FlightsEngine();
        flightsEngine.findFlightFrom("Wroclaw");
        System.out.println(flightsEngine);
    }
}
