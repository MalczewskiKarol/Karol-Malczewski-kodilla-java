package com.kodilla.testing.shape;
import java.util.*;

public class ShapeCollector {
    private  String shapeName;
    private  int field;

    public static ArrayList<Shape> figures = new ArrayList<Shape>();

    public ShapeCollector(String shapeName, int field) {
        this.shapeName = shapeName;
        this.field = field;
    }


    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public boolean removeFigure(Shape shape) {
            return figures.remove(shape);
    }

    public Shape getFigure(int n) {

        return figures.get(n);
    }

    public ArrayList<Shape> showFigures() {

        return figures;
    }
}