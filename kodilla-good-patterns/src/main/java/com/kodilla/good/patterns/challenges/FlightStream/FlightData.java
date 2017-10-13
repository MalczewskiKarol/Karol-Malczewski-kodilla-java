package com.kodilla.good.patterns.challenges.FlightStream;

public final class FlightData {
    String airportStart;
    String airportEnd;

    public FlightData(final String airportStart, final String airportEnd) {
        this.airportStart = airportStart;
        this.airportEnd = airportEnd;
    }

    public String getAirportStart() {
        return airportStart;
    }

    public String getAirportEnd() {
        return airportEnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightData that = (FlightData) o;

        if (!airportStart.equals(that.airportStart)) return false;
        return airportEnd.equals(that.airportEnd);
    }

    @Override
    public int hashCode() {
        int result = airportStart.hashCode();
        result = 31 * result + airportEnd.hashCode();
        return result;
    }
}
