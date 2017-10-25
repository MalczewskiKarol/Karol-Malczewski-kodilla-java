package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("sesame")
                .burgers(2)
                .ingredient("onion")
                .ingredient("bacon")
                .ingredient("lettuce")
                .ingredient("cheese")
                .ingredient("mushrooms")
                .sauce("barbecue")
                .build();
        System.out.println(bigmac);

        //When
        String typeOfRoll = bigmac.getRoll();
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        String kindOfSauce = bigmac.getSauce();

        //Then
        Assert.assertEquals("sesame", typeOfRoll);
        Assert.assertEquals(5, howManyIngredients);
        Assert.assertEquals(2, howManyBurgers);
        Assert.assertEquals("barbecue", kindOfSauce);
    }
}
