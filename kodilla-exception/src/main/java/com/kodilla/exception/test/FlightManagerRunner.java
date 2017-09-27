package com.kodilla.exception.test;

public class FlightManagerRunner {

    public static void main(String[] args) throws Exception {

        FlightManager flightManager = new FlightManager();
        try {
            flightManager.findFlight(new Flight("Radom", "Lublin"));

        } catch (RouteNotFoundException f) {
            System.out.println("This airport is not available at the moment.");
        } finally {

            System.out.println("Thanks for using our services!");
        }
    }
}