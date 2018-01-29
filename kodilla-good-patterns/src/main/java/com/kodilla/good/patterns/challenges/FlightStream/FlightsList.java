package com.kodilla.good.patterns.challenges.FlightStream;

import java.util.HashSet;
import java.util.Set;

public final class FlightsList {
    public final Set<Flights> theFlightsList = new HashSet<>();

    public FlightsList() {
        theFlightsList.add(new Flights("Wroclaw", "Warszawa", null));
        theFlightsList.add(new Flights("Warszawa", "Wroclaw", null));
        theFlightsList.add(new Flights("Poznan", "Warszawa", "Torun"));
        theFlightsList.add(new Flights("Warszawa", "Poznan", null));
        theFlightsList.add(new Flights("Krakow", "Warszawa", "Katowice"));
        theFlightsList.add(new Flights("Warszawa", "Krakow", null));
        theFlightsList.add(new Flights("Wroclaw", "Radom", "Lodz"));
        theFlightsList.add(new Flights("Radom", "Wroclaw", null));
        theFlightsList.add(new Flights("Szczecin", "Warszawa", "Wroclaw"));
        theFlightsList.add(new Flights("Wroclaw", "Szczecin", null));
        theFlightsList.add(new Flights("Szczecin", "Krakow", "Bydgoszcz"));
        theFlightsList.add(new Flights("Torun", "Warszawa", null));
        theFlightsList.add(new Flights("Lodz", "Warszawa", null));
        theFlightsList.add(new Flights("Szczecin", "Wroclaw", "Warszawa"));


    }

    public Set<Flights> getFlightsList() {
        return new HashSet<>(theFlightsList);

    }
}
