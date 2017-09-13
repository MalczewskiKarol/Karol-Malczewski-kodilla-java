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


    public void addFigure(Shape shape) {

    }

    public boolean removeFigure(Shape shape) {
        //pusto
        return true;
    }

    public ArrayList<Shape> getFigures(int n) {
        //pusto
        return figures;
    }

    public ArrayList<Shape> showFigures() {

        return figures;
    }

}
