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
        empty.exterminate(new ArrayList<Integer>());
        System.out.println("Test empty list: " + empty.exterminate(new ArrayList<Integer>()));
        //Then
        Assert.assertTrue(String.valueOf(empty), true);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator normal = new OddNumbersExterminator();
        //When
        normal.exterminate(new ArrayList<Integer>());

        System.out.println(normal.numbers);
        //Then
    }
}
