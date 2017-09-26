package com.kodilla.exception.test;

import java.util.HashMap;

public class RouteNotFoundException extends Exception {

    public RouteNotFoundException(final String findFlight) {

        super(findFlight);
    }

}
