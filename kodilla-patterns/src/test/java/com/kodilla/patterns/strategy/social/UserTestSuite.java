package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User karol = new Millenials("Karol Malczewski");
        User grzegorz = new ZGeneration("Grzegorz Malczewski");
        User tomasz = new YGeneration("Tomasz Mieleszkiewicz");

        //When
        String karolShouldUse = karol.sharePost();
        System.out.println("Karol use: " + karolShouldUse);
        String grzegorzShouldUse = grzegorz.sharePost();
        System.out.println("Grzegorz use: " + grzegorzShouldUse);
        String tomaszShouldUse = tomasz.sharePost();
        System.out.println("Tomasz use: " + tomaszShouldUse);

        //Then
        Assert.assertEquals("Twitter", karolShouldUse);
        Assert.assertEquals("Facebook", grzegorzShouldUse);
        Assert.assertEquals("Snapchat", tomaszShouldUse);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User karol = new YGeneration("Karol Malczewski");

        //When
        String karolUse = karol.sharePost();
        System.out.println("Karol use: " + karolUse);
        karol.setSocialMedia(new FacebookPublisher());
        karolUse = karol.sharePost();
        System.out.println("Karol use: " + karolUse);

        //Then
        Assert.assertEquals("Facebook", karolUse);

    }
}
