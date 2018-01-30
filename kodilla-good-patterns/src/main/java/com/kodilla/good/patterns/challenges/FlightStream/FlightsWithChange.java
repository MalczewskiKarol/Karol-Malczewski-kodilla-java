package com.kodilla.good.patterns.challenges.FlightStream;

public final class FlightsWithChange {
    private String flyFromWithChange;
    private String flyToWithChange;
    private String flyByWithChange;

    public FlightsWithChange(String flyFromWithChange, String flyToWithChange, String flyByWithChange) {
        this.flyFromWithChange = flyFromWithChange;
        this.flyToWithChange = flyToWithChange;
        this.flyByWithChange = flyByWithChange;
    }

    public String getFlyFromWithChange() {
        return flyFromWithChange;
    }

    public String getFlyToWithChange() {
        return flyToWithChange;
    }

    public String getFlyByWithChange() {
        return flyByWithChange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightsWithChange that = (FlightsWithChange) o;

        if (flyFromWithChange != null ? !flyFromWithChange.equals(that.flyFromWithChange) : that.flyFromWithChange != null)
            return false;
        if (flyToWithChange != null ? !flyToWithChange.equals(that.flyToWithChange) : that.flyToWithChange != null)
            return false;
        return flyByWithChange != null ? flyByWithChange.equals(that.flyByWithChange) : that.flyByWithChange == null;
    }

    @Override
    public int hashCode() {
        int result = flyFromWithChange != null ? flyFromWithChange.hashCode() : 0;
        result = 31 * result + (flyToWithChange != null ? flyToWithChange.hashCode() : 0);
        result = 31 * result + (flyByWithChange != null ? flyByWithChange.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "[" + flyFromWithChange + "] => [" + flyToWithChange + "] [CHANGE IN {" + flyByWithChange + "}]";
    }
}
