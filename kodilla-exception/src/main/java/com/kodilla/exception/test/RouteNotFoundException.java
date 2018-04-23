package com.kodilla.exception.test;

public class RouteNotFoundException extends NullPointerException {

    public RouteNotFoundException(String message) {
        super(message);

    }
}
