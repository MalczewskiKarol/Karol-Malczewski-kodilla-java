package com.kodilla.stream.world;
import java.util.ArrayList;
import java.util.List;


public final class Continent3 {
    private final String continentName;

    private final List<Country> countries = new ArrayList<>(); {
    }

    public Continent3(String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public boolean removeCountry(Country country) {
        return countries.remove(country);
    }
}
