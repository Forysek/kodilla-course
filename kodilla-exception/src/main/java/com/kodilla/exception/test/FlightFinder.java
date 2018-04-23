package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {
    private static HashMap<String, Boolean> flights = new HashMap<>();

    static {
        flights.put( "Warszawa", true );
        flights.put( "Gdansk", true );
        flights.put( "Wroclaw", false );
    }
    public static void findFlight(Flight flight) throws RouteNotFoundException {

        if (flights.containsKey(flight.getArrivalAirport()) &&
                flights.get(flight.getArrivalAirport())) {
            System.out.println( "Airport is open for travel." );

        } else if (flights.containsKey(flight.getArrivalAirport()) &&
                !flights.get(flight.getArrivalAirport())) {
            System.out.println( "Airport is closed for travel." );

        } else {
            throw new RouteNotFoundException( "An exception occured while searching for an airport.");
        }
    }

}