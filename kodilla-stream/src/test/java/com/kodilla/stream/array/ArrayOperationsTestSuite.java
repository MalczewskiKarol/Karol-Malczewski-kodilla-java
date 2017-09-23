package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {5, 14, 10, 3, 100, 23, 56, 75, 2, 98, 22, 11, 8, 73, 35, 27, 99, 31, 20, 50};

        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(38.1, result, 0);

    }
}