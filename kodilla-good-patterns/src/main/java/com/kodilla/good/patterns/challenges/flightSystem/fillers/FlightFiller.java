package com.kodilla.good.patterns.challenges.flightSystem.fillers;

import com.kodilla.good.patterns.challenges.flightSystem.flights.Flight;
import com.kodilla.good.patterns.challenges.flightSystem.flights.FlightContainer;

public class FlightFiller {

    public FlightContainer fillFlights() {

        Flight flight1 = new Flight( "Gdansk", "Wroclaw" );
        Flight flight2 = new Flight( "Warszawa", "Gdansk" );
        Flight flight3 = new Flight( "Wroclaw", "Warszawa" );
        Flight flight4 = new Flight( "Gdansk", "Szczecin" );
        Flight flight5 = new Flight( "Szczecin", "Amsterdam" );

        FlightContainer flightContainer = new FlightContainer();

        flightContainer.addFlightToSet( flight1 )
                .addFlightToSet( flight2 )
                .addFlightToSet( flight3 )
                .addFlightToSet( flight4 )
                .addFlightToSet( flight5 );

        return flightContainer;
    }
}
