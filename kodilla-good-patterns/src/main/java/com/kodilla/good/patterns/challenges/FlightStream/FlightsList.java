package com.kodilla.good.patterns.challenges.FlightStream;

import java.util.HashSet;
import java.util.Set;

public final class FlightsList {
    public final Set<Flights> theFlightsList = new HashSet<>();

    public FlightsList() {
        theFlightsList.add(new Flights("Wroclaw", "Poznan"));
        theFlightsList.add(new Flights("Poznan", "Warszawa"));
        theFlightsList.add(new Flights("Warszawa", "Wroclaw"));
        theFlightsList.add(new Flights("Warszawa", "Poznan"));
        theFlightsList.add(new Flights("Krakow", "Warszawa"));
        theFlightsList.add(new Flights("Warszawa", "Krakow"));
        theFlightsList.add(new Flights("Wroclaw", "Radom"));
        theFlightsList.add(new Flights("Radom", "Wroclaw"));
        theFlightsList.add(new Flights("Szczecin", "Poznan"));
        theFlightsList.add(new Flights("Wroclaw", "Szczecin"));
        theFlightsList.add(new Flights("Szczecin", "Poznan"));
        theFlightsList.add(new Flights("Lodz", "Warszawa"));
        theFlightsList.add(new Flights("Szczecin", "Poznan"));
    }

    public Set<Flights> getFlightsList() {
        return new HashSet<>(theFlightsList);

    }
}
