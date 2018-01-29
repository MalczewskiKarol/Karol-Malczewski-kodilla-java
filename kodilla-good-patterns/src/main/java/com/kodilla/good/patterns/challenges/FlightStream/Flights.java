package com.kodilla.good.patterns.challenges.FlightStream;

import java.util.Optional;

public final class Flights {
    private String flyFrom;
    private String flyTo;
    private String flyBy;

    public Flights(String flyFrom, String flyTo, String flyBy) {
        this.flyFrom = flyFrom;
        this.flyTo = flyTo;
        this.flyBy = flyBy;
    }

    public String getFlyFrom() {
        return flyFrom;
    }

    public String getFlyTo() {
        return flyTo;
    }

    public String getFlyBy() {
        return flyBy;
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
        if(flyBy == null) {
            return "[" + flyFrom + "] => [" + flyTo + "]";
        } else {
            return "[" + flyFrom + "] => [" + flyTo + "] CHANGE IN {" + flyBy + "}";
        }
    }
}
