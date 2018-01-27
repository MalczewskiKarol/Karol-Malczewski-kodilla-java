package com.kodilla.good.patterns.challenges.FlightStream;

import java.util.ArrayList;
import java.util.List;

public final class FlightsList {
    public final List<Flights> theFlightsList = new ArrayList<>();

    public FlightsList() {
        theFlightsList.add(new Flights("Wroclaw", "Warszawa"));
        theFlightsList.add(new Flights("Warszawa", "Wroclaw"));
        theFlightsList.add(new Flights("Poznan", "Warszawa"));
        theFlightsList.add(new Flights("Warszawa", "Poznan"));
        theFlightsList.add(new Flights("Krakow", "Warszawa"));
        theFlightsList.add(new Flights("Warszawa", "Krakow"));
        theFlightsList.add(new Flights("Wroclaw", "Radom"));
        theFlightsList.add(new Flights("Radom", "Wroclaw"));
        theFlightsList.add(new Flights("Szczecin", "Warszawa"));
        theFlightsList.add(new Flights("Wroclaw", "Szczecin"));
        theFlightsList.add(new Flights("Gdansk", "Warszawa"));
    }

    public List<Flights> getFlightsList() {
        return new ArrayList<>(theFlightsList);
    }

    public void getToString() {
        for(int n = 0; n < theFlightsList.size(); n++) {
            theFlightsList.get(n).toString();
        }
    }
}
