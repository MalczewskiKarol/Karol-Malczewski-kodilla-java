package com.kodilla.good.patterns.challenges.FlightStream;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.internal.util.collections.Sets;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class FlightsEngineTestSuite {
    @Test
    public void findFlightFrom() throws Exception {
        //Given
        Flights flights = new Flights("Wroclaw", "Poznan");
        Set<Flights> flightsSet = Sets.newSet(flights);
        //When
        flightsSet.contains(flights.getFlyFrom().equals("Wroclaw"));
        //Then
        assertEquals("Wroclaw", flights.getFlyFrom());
    }
}