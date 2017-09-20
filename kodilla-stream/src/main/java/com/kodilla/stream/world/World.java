package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class World {


    private final List<Continent> continents = new ArrayList<>();

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public boolean removeContinent(Continent continent) {
        return  continents.remove(continent);
    }

    public List<BigDecimal> getPeopleQuantity() {
        return continents.stream()
                .flatMap(Continent -> Continent.getPeopleQuantity().stream())
                .collect(Collectors.toList());
    }

}
