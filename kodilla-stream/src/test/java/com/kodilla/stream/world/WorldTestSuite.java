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
        Continent continent = new Continent("Europe");
        continent.addCountry(new Country("Poland", new BigDecimal("901234567890")));
        continent.addCountry(new Country("Germany", new BigDecimal("3265325467")));
        continent.addCountry(new Country("Norway", new BigDecimal("75436543")));
        Continent continent1 = new Continent("Asia");
        continent1.addCountry(new Country("Russia", new BigDecimal("53234567890")));
        continent1.addCountry(new Country("China", new BigDecimal("876536543754320")));
        continent1.addCountry(new Country("Japan", new BigDecimal("34567890")));
        continent1.addCountry(new Country("India", new BigDecimal("5211234567890")));
        Continent continent2 = new Continent("America");
        continent2.addCountry(new Country("United States", new BigDecimal("5342634567890")));
        continent2.addCountry(new Country("Brasil", new BigDecimal("654353420")));
        continent2.addCountry(new Country("Argentina", new BigDecimal("5553423390")));
        continent2.addCountry(new Country("Mexico", new BigDecimal("4567890")));
        continent2.addCountry(new Country("Peru", new BigDecimal("4235679")));


        World world = new World();
        world.addContinent(continent);
        world.addContinent(continent1);
        world.addContinent(continent2);

        List<World> continents = new ArrayList<>();
        continents.add(world);

        //When
        BigDecimal totalPeopleQuantity = continents.stream()
                .map(World::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        //Then
        BigDecimal expectedQuantity = new BigDecimal("888054473936159");
        Assert.assertEquals( totalPeopleQuantity, expectedQuantity);
        System.out.println("World population clock: " + totalPeopleQuantity);
    }
}
