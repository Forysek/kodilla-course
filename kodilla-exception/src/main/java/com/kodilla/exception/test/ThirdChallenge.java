package com.kodilla.exception.test;

public class ThirdChallenge {
    public static void main(String[] args) {

        Flight flight1 = new Flight("Warszawa", "Gdansk");
        Flight flight2 = new Flight( "Gdansk", "Wroclaw" );
        Flight flight3 = new Flight( "Wroclaw", "Szczecin" );

        try {

            FlightFinder.findFlight( flight1 );
            FlightFinder.findFlight( flight2 );
            FlightFinder.findFlight( flight3 );

        } catch(RouteNotFoundException e){

            System.out.println( "There is no such destination as given. Please check if it is correct or provide a new one." );

        }
    }
}