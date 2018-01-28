package com.kodilla.good.patterns.challenges.FlightStream;

public final class Flights {
    private String flyFrom;
    private String flyTo;

    public Flights(String flyFrom, String flyTo) {
        this.flyFrom = flyFrom;
        this.flyTo = flyTo;
    }

    public String getFlyFrom() {
        return flyFrom;
    }

    public String getFlyTo() {
        return flyTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flights that = (Flights) o;

        if (!flyFrom.equals(that.flyFrom)) return false;
        return flyTo.equals(that.flyTo);
    }

    @Override
    public int hashCode() {
        int result = flyFrom.hashCode();
        result = 31 * result + flyTo.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "[" + flyFrom + "] => [" + flyTo +"]";
    }
}
