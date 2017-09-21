package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        IntStream.range(0, 21)
                .forEach(System.out::println);
        //When
        IntStream.range(0, 21)
                .average();
        //Then
        Assert.assertEquals(10.0, IntStream.range(0, 21).average());
    }
}