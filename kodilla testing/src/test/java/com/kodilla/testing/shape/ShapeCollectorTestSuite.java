package com.kodilla.testing.shape;

import org.junit.*;
import java.util.ArrayList;
import static com.kodilla.testing.shape.ShapeCollector.figures;

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
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing for execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector("Square", 3);
        Circle circle = new Circle("Circle", 5);
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertTrue(figures.add(circle));
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector("Square", 3);
        Triangle triangle = new Triangle("Triangle", 4);
        shapeCollector.addFigure(triangle);
        //When
       boolean result = shapeCollector.removeFigure(triangle);
        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector("Square", 3);
        Square square = new Square("Square", 3);
        shapeCollector.addFigure(square);
        //When
        Shape retrievedFigure = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(retrievedFigure, square);

    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector("Square", 3);
        Square square = new Square("Square", 3);
        Triangle triangle = new Triangle("Triangle", 4);
        Circle circle = new Circle("Circle", 5);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        //When
        ArrayList<Shape> showedFigure;
        showedFigure = shapeCollector.showFigures();
        //Then
        Assert.assertEquals(figures, showedFigure);
    }
}
