package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightManager {

    HashMap<String, Boolean> findFlight (Flight flight) throws Exception {
        HashMap<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Warsaw" + "Berlin", true);
        flightMap.put("Poznan" + "Warsaw", true);
        flightMap.put("Warsaw" + "Radom", false);

        if(false) {
            throw new RouteNotFoundException("Radom airport will be completed in 2038.");
        }

        return (HashMap<String, Boolean>) flightMap.entrySet();
    }
}
