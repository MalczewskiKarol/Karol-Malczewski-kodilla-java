package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightManager {

    HashMap<String, Boolean> findFlight (Flight flight) throws Exception {

        HashMap<String, Boolean> flightMap = new HashMap<>();

        flightMap.put("Warszawa" + "Gdansk", true);
        flightMap.put("Radom" + "Lublin", false);
        flightMap.put("Poznan" + "Krakow", true);
        flightMap.put("Warszawa" + "Berlin", true);

        if(flight.departureAirport.contains("Radom"))

        {
            throw new RouteNotFoundException(flight + " is not available.");
        }

        return flightMap;
    }
}