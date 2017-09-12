package com.kodilla.testing.shape;
import java.util.*;

public class ShapeCollector {
    private String shapeName;
    private int field;

    private ArrayList<ShapeCollector> shapes = new ArrayList<ShapeCollector>();


    public ShapeCollector(String shapeName, int field) {
        this.shapeName = shapeName;
        this.field = field;

    }

    public static void addFigure(Shape shape) {
        //pusto
    }

    public boolean removeFigure(Shape shape) {
        //pusto
        return true;
    }

    public ShapeCollector getFigure(int n) {
        //pusto
        return figure;
    }

    public showFigures() {
        //pusto
        return figures;
    }

    public String getShapeName() {
        return shapeName;
    }

    public int getField() {
        return field;
    }


}
