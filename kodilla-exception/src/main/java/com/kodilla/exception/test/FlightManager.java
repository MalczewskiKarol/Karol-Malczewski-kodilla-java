package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightManager {

    HashMap<String, Boolean> findFlight (Flight flight) throws Exception {
        HashMap<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Gdansk" + "Berlin", true);
        flightMap.put("Poznan" + "Warsaw", true);
        flightMap.put("Warsaw" + "Radom", false);

        if(flightMap.containsValue(false)) {

            throw new RouteNotFoundException("Radom airport is not available.");
        }
        return flightMap;
    }
}
