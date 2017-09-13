package com.kodilla.testing.shape;

public class Square implements Shape {

    String shapeName;
    int field;

    public String shapeName() {

        return "Square";
    }

    public int field() {

        return 3;
    }

    public Square(String shapeName, int field) {
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

        Square square = (Square) o;

        if (field != square.field) return false;
        return shapeName.equals(square.shapeName);
    }

    @Override
    public int hashCode() {
        int result = shapeName.hashCode();
        result = 31 * result + field;
        return result;
    }
}
