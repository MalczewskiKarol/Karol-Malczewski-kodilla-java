package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country8 {
    private final String countryName;
    private final BigDecimal peopleQuantity;

    public Country8(final String countryName, final BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country8 country = (Country8) o;

        return countryName.equals(country.countryName);
    }

    @Override
    public int hashCode() {
        return countryName.hashCode();
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantity = new BigDecimal("56423453");
        return peopleQuantity;
    }
}
