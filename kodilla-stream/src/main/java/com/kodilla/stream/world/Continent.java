package com.kodilla.stream.world;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public final class Continent {
    private final String continentName;
    private final String location;

    private final List<Country> countries = new ArrayList<>();

    public Continent(final String continentName, final String location) {
        this.continentName = continentName;
        this.location = location;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public boolean removeCountry(Country country) {
        return countries.remove(country);
    }

    public List<BigDecimal> getPeopleQuantity() {
        return countries.stream()
                .map(Country -> Country.getPeopleQuantity())
                .collect(Collectors.toList());
    }
}
