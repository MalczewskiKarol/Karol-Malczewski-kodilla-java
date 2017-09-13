package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is beginning of the tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public static void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing for execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector newShape = new ShapeCollector("Square", 3);
        //When
        String result = newShape.addFigure(Shape, shape);
        //Then
        Assert.assertEquals("Square" , result);
    }

    @Test
    public void testRemoveFigure() {
        //Given
    }
}
