package com.kodilla.good.patterns.challenges.internet.shop.fillers;

import com.kodilla.good.patterns.challenges.internet.shop.orders.OrderRequest;

public class RequestFiller {

    public OrderRequest requestOrder(){

        OrderRequest orderRequest = new OrderRequest( "Battlefield 1", "Game" );

        return orderRequest;
    }
}
