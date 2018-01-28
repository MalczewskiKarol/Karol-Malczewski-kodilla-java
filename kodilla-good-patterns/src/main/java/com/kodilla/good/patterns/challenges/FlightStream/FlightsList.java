package com.kodilla.good.patterns.challenges.FlightStream;

import java.util.ArrayList;
import java.util.List;

public final class FlightsList {
    public final List<Flights> theFlightsList = new ArrayList<>();

    public FlightsList() {
        theFlightsList.add(new Flights("Wroclaw", "Warszawa", "[directly]"));
        theFlightsList.add(new Flights("Warszawa", "Wroclaw", "[directly]"));
        theFlightsList.add(new Flights("Poznan", "Warszawa", "[Torun]"));
        theFlightsList.add(new Flights("Warszawa", "Poznan", "[directly]"));
        theFlightsList.add(new Flights("Krakow", "Warszawa", "[Katowice]"));
        theFlightsList.add(new Flights("Warszawa", "Krakow", "[directly]"));
        theFlightsList.add(new Flights("Wroclaw", "Radom", "Lodz"));
        theFlightsList.add(new Flights("Radom", "Wroclaw", "[directly]"));
        theFlightsList.add(new Flights("Szczecin", "Warszawa", "Wroclaw"));
        theFlightsList.add(new Flights("Wroclaw", "Szczecin", "[directly]"));
        theFlightsList.add(new Flights("Szczecin", "Krakow", "Bydgoszcz"));
        theFlightsList.add(new Flights("Torun", "Warszawa", "[directly]"));
        theFlightsList.add(new Flights("Lodz", "Warszawa", "[directly]"));
        theFlightsList.add(new Flights("Szczecin", "Wroclaw", "[Warszawa]"));


    }

    public List<Flights> getFlightsList() {
        return new ArrayList<>(theFlightsList);

    }
}
