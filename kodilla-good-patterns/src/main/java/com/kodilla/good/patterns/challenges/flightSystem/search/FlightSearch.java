package com.kodilla.good.patterns.challenges.flightSystem.search;

import com.kodilla.good.patterns.challenges.flightSystem.flights.Flight;
import com.kodilla.good.patterns.challenges.flightSystem.flights.FlightContainer;

import java.util.Scanner;
import java.util.stream.Collectors;

public class FlightSearch {
    private FlightContainer flightContainer;

    public FlightSearch(FlightContainer flightContainer) {
        this.flightContainer = flightContainer;
    }

    public void lookForARoute() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input departure airport: ");
        String flightStartLocation = scanner.nextLine();
        System.out.println("Please input arrival airport: ");
        String flightEndLocation = scanner.nextLine();
        System.out.println("Please input mid-landing airport: ");
        String flightMidLocation = scanner.nextLine();

        if(flightMidLocation.isEmpty()) {
            String searchedRoute = flightContainer.getAllFlights().stream()
                    .filter( f -> f.getDepartureAirport().equals( flightStartLocation ) ||
                            flightStartLocation.isEmpty())
                    .filter( f -> f.getArrivalAirport().equals( flightEndLocation ) ||
                            flightEndLocation.isEmpty())
                    .map( Flight::toString )
                    .collect( Collectors.joining( ",\n" ) );
            System.out.println( searchedRoute );

        } else {
            String searchedRoute = flightContainer.getAllFlights().stream()
                    .filter( f -> f.getDepartureAirport().equals( flightStartLocation )  ||
                            f.getArrivalAirport().equals( flightEndLocation ) )
                    .filter( f -> f.getArrivalAirport().equals( flightMidLocation )  ||
                            f.getDepartureAirport().equals( flightMidLocation ) )
                    .map( Flight::toString )
                    .collect( Collectors.joining( ",\n" ) );
            System.out.println(searchedRoute);

        }
    }
}
