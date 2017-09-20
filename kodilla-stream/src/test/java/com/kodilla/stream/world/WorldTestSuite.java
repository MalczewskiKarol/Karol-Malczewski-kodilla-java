package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("Poland", new BigDecimal("901234567890")));
        countries.add(new Country("Germany", new BigDecimal("3265325467")));
        countries.add(new Country("Norway", new BigDecimal("75436543")));

        //When

        BigDecimal totalPeopleQuantity = BigDecimal.ZERO;
        for(Country quantity : countries) {
            totalPeopleQuantity = totalPeopleQuantity.add(quantity.getPeopleQuantity());
        }
        //Then
        BigDecimal expectedQuantity = new BigDecimal("12352305097975329900");
        Assert.assertEquals(expectedQuantity, totalPeopleQuantity);

    }
}
