package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class FlightManagerRunner {

    public static void main(String[] args) throws Exception {
        FlightManager flightManager = new FlightManager();
        try {

            flightManager.findFlight(new Flight("Warsaw", "Radom"));

        } catch (RouteNotFoundException f) {

            System.out.println("Warsaw > Radom flight is not available at the moment.");
        } finally {

            System.out.println("Thanks for using our services!");
        }
    }
}