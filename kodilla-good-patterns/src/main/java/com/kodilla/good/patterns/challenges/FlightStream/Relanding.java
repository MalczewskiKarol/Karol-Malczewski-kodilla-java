package com.kodilla.good.patterns.challenges.FlightStream;

public final class Relanding {
    String cityRelanding;

    public Relanding(final String cityRelanding) {
        this.cityRelanding = cityRelanding;
    }

    public String getCityRelanding() {
        return cityRelanding;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Relanding relanding = (Relanding) o;

        return cityRelanding != null ? cityRelanding.equals(relanding.cityRelanding) : relanding.cityRelanding == null;
    }

    @Override
    public int hashCode() {
        return cityRelanding != null ? cityRelanding.hashCode() : 0;
    }


}
