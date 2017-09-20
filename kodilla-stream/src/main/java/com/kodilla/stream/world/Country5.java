package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country5 {
    private final String countryName;
    private final BigDecimal peopleQuantity;

    public Country5(final String countryName, final BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country5 country = (Country5) o;

        return countryName.equals(country.countryName);
    }

    @Override
    public int hashCode() {
        return countryName.hashCode();
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantity = new BigDecimal("6453241655");
        return peopleQuantity;
    }
}
