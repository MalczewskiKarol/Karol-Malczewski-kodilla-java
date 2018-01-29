package com.kodilla.good.patterns.challenges.FlightStream;

public class FlightsFromTo {
    private Flights flight1;
    private Flights flight2;

    public FlightsFromTo(Flights flight1, Flights flight2) {
        this.flight1 = flight1;
        this.flight2 = flight2;
    }

    public Flights getFlight1() {
        return flight1;
    }

    public Flights getFlight2() {
        return flight2;
    }

    @Override
    public String toString() {
        return "Flights from " + flight1 + "to " + flight2 + ":";
    }
}
