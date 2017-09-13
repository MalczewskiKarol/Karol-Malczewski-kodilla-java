package com.kodilla.testing.shape;
import java.util.*;

public class ShapeCollector {
    private String shapeName;
    private int field;

    private ArrayList<Shape> figures = new ArrayList<Shape>();

    public ShapeCollector(String shapeName, int field) {
        this.shapeName = shapeName;
        this.field = field;
    }


    public static void addFigure(Shape shape) {


    }

    public static boolean removeFigure(Shape shape) {


        return true;
    }

    public ArrayList<Shape> getFigures(int n) {

        return figures;
    }

    public ArrayList<Shape> showFigures() {

        return figures;
    }

}
