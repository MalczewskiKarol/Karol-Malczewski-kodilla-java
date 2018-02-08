package com.kodilla.testing.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAdd() throws Exception {
        //Given
        Calculator calculator = new Calculator();
        //When
        int result = calculator.add(3, 5);
        //Then
        assertEquals(result, 8);
    }

    @Test
    public void testSubstract() throws Exception {
        //Given
        Calculator calculator = new Calculator();
        //When
        int result = calculator.substract(5, 1);
        //Then
        assertEquals(result, 4);
    }
}