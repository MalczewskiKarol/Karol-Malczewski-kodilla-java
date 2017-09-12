package com.kodilla.testing.shape;

import com.kodilla.testing.shape.*;
import org.junit.*;

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
        ShapeCollector shapeCollector = new ShapeCollector("Square", 6);
        //When
        ShapeCollector.addFigure();
    }
}
