package com.kodilla.exception.test;

public class ExceptionHandling {

    SecondChallenge secondChallenge = new SecondChallenge();

    public void exceptionHandler(){

        try {
            secondChallenge.probablyIWillThrowException( 2.1, 1.75 );
        } catch (Exception e ) {
            System.out.println( "Caught Exception " + e );
        } finally {
            System.out.println( "Finished task" );
        }

    }
}