package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private Continent continent;

    private final List<Continent> continents = new ArrayList<>(); {
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal worldPeopleQuantity = new BigDecimal("12345678901234567890");
        return worldPeopleQuantity;
    }
}
