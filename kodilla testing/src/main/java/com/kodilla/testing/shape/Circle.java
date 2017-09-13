package com.kodilla.testing.shape;

public class Circle implements Shape {

    String shapeName;
    int field;

    public String shapeName() {

        return "Circle";
    }

    public int field() {

        return 5;
    }

    public Circle(String shapeName, int field) {
        this.shapeName = shapeName;
        this.field = field;
    }

    public String getShapeName() {
        return shapeName;
    }

    public int getField() {
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (field != circle.field) return false;
        return shapeName.equals(circle.shapeName);
    }

    @Override
    public int hashCode() {
        int result = shapeName.hashCode();
        result = 31 * result + field;
        return result;
    }
}
