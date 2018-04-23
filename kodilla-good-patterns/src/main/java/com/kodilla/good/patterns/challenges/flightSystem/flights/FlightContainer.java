package com.kodilla.good.patterns.challenges.flightSystem.flights;

import java.util.HashSet;

public class FlightContainer {
    private final HashSet<Flight> allFlights = new HashSet<>();

    public FlightContainer addFlightToSet(Flight flight){
        allFlights.add( flight );
        return this;
    }

    public HashSet<Flight> getAllFlights() {
        return allFlights;
    }
}
