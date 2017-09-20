package com.kodilla.stream.world;
import java.util.ArrayList;
import java.util.List;


public final class Continent6 {
    private final String continentName;

    private final List<Country> countries = new ArrayList<>(); {
        countries.add(new Country("Country6"));
        countries.add(new Country("Country7"));
        countries.add(new Country("Country8"));
    }

    public Continent6(String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public boolean removeCountry(Country country) {
        return countries.remove(country);
    }
}
