package com.kodilla.testing.collection;

import org.junit.*;
import java.lang.*;
import java.util.*;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator empty = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = empty.exterminate(new ArrayList<Integer>());
        System.out.println("Test list: " + empty.exterminate(new ArrayList<Integer>()));
        //Then
        ArrayList<Object> emptylist = new ArrayList<>();
        Assert.assertEquals(emptylist, result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);

        OddNumbersExterminator normal = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = normal.exterminate(numbers);
        //Then
        ArrayList<Integer> numbers1 = new ArrayList<Integer>();
        numbers1.add(2);
        numbers1.add(4);
        numbers1.add(6);
        numbers1.add(8);
        numbers1.add(10);
        numbers1.add(12);
        numbers1.add(14);

        Assert.assertEquals(numbers1, result);
        System.out.println("Test list: " + numbers1);
    }
}
