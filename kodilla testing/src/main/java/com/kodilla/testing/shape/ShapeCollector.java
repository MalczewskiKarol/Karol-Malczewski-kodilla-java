package com.kodilla.testing.shape;
import java.util.*;

public class ShapeCollector {
    private static String shapeName;
    private static int field;

    public static ArrayList<Shape> figures = new ArrayList<Shape>();

    public ShapeCollector(String shapeName, int field) {
        this.shapeName = shapeName;
        this.field = field;
    }


    public static void addFigure(Shape shape) {
        ShapeCollector shapeCollector = new ShapeCollector(shapeName, field);
        figures.add((com.kodilla.testing.shape.Shape) shapeCollector);
    }

    public static boolean removeFigure(Shape shape) {
        boolean result = false;
        if(figures.contains(shape)) {
            figures.remove(shape);
            result = true;
        }
        return result;
    }

    public ArrayList<Shape> getFigure(int n) {
        Shape theFigure = null;
        if(n >= 0 && n < figures.size()) {
            theFigure = figures.get(n);
        }

        return (ArrayList<Shape>) theFigure;
    }

    public ArrayList<Shape> showFigures() {

        return figures;
    }
}