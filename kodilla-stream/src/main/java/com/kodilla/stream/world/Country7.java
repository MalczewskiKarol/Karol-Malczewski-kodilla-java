package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country7 {
    private final String countryName;

    public Country7(final String countryName) {
        this.countryName = countryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country7 country = (Country7) o;

        return countryName.equals(country.countryName);
    }

    @Override
    public int hashCode() {
        return countryName.hashCode();
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantity = new BigDecimal("754327654865");
        return peopleQuantity;
    }
}
