package com.kodilla.good.patterns.challenges.flightSystem;

import com.kodilla.good.patterns.challenges.flightSystem.fillers.FlightFiller;
import com.kodilla.good.patterns.challenges.flightSystem.flights.FlightContainer;
import com.kodilla.good.patterns.challenges.flightSystem.search.FlightSearch;

public class FlightsMain {
    public static void main(String[] args) {

        FlightFiller flightFiller = new FlightFiller();
        FlightContainer flightContainer = flightFiller.fillFlights();

        FlightSearch availableRoutes = new FlightSearch(flightContainer);
        availableRoutes.lookForARoute();
    }
}