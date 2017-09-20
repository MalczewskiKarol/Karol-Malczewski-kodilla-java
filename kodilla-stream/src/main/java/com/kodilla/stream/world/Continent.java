package com.kodilla.stream.world;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public final class Continent {
    private final String continentName;
    private final List<Country> countries = new ArrayList<>();

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public List<Country> getCountries() {
        return countries;
    }

//    public List<BigDecimal> getPeopleQuantity() {
//        return countries.stream()
//                .map(Country::getPeopleQuantity)
//                .collect(Collectors.toList());
//    }
}
