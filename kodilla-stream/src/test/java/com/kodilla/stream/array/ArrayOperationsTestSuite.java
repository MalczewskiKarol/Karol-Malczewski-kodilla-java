package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @Test
    public double testGetAverage() {
        //Given
        int[] numbers = new int[20];
        numbers[0] = 7;
        numbers[1] = 32;
        numbers[2] = 84;
        numbers[3] = 15;
        numbers[4] = 9;
        numbers[5] = 38;
        numbers[6] = 11;
        numbers[7] = 25;
        numbers[8] = 34;
        numbers[9] = 66;
        numbers[10] = 10;
        numbers[11] = 93;
        numbers[12] = 77;
        numbers[13] = 31;
        numbers[14] = 95;
        numbers[15] = 72;
        numbers[16] = 12;
        numbers[17] = 83;
        numbers[18] = 63;
        numbers[19] = 48;

        ArrayOperations.getAverage(numbers);
        //When
        double result = IntStream.range(0, 20)
                .forEach(System.out::println);
        IntStream.range(0, 20)
                .average();
        return result;
        //Then
        Assert.assertEquals(45.25, );
    }

}
