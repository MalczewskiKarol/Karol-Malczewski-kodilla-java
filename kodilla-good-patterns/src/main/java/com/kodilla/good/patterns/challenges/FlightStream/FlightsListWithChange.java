package com.kodilla.good.patterns.challenges.FlightStream;

import java.util.HashSet;
import java.util.Set;

public final class FlightsListWithChange {
    public final Set<FlightsWithChange> theFlightsListWithChange = new HashSet<>();

    public FlightsListWithChange() {
        theFlightsListWithChange.add(new FlightsWithChange("Poznan", "Poznan", "Wroclaw"));
        theFlightsListWithChange.add(new FlightsWithChange("Krakow", "Warszawa", "Katowice"));
        theFlightsListWithChange.add(new FlightsWithChange("Poznan", "Krakow", "Gdansk"));
        theFlightsListWithChange.add(new FlightsWithChange("Wroclaw", "Radom", "Lodz"));
        theFlightsListWithChange.add(new FlightsWithChange("Radom", "Wroclaw", "Warszawa"));
        theFlightsListWithChange.add(new FlightsWithChange("Szczecin", "Warszawa", "Wroclaw"));
        theFlightsListWithChange.add(new FlightsWithChange("Poznan", "Szczecin", "Wroclaw"));
        theFlightsListWithChange.add(new FlightsWithChange("Szczecin", "Krakow", "Bydgoszcz"));
        theFlightsListWithChange.add(new FlightsWithChange("Poznan", "Warszawa", "Gdansk"));
        theFlightsListWithChange.add(new FlightsWithChange("Lodz", "Warszawa", "Wroclaw"));
        theFlightsListWithChange.add(new FlightsWithChange("Szczecin", "Wroclaw", "Warszawa"));


    }

    public Set<FlightsWithChange> getTheFlightsListWithChange() {
        return new HashSet<>(theFlightsListWithChange);

    }
}
