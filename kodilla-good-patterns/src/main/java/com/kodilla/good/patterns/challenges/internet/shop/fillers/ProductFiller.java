package com.kodilla.good.patterns.challenges.internet.shop.fillers;

import com.kodilla.good.patterns.challenges.internet.shop.product.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductFiller {

    public Map<String, Product> fillProducts() {

        Product product1 = new Product( "000001","Battlefield 1", "Game" );
        Product product2 = new Product( "000002","The Firm", "Movie" );
        Map< String, Product> products = new HashMap<>();

        products.put( product1.getStoreId(), product1 );
        products.put( product2.getStoreId(), product2 );

        return products;
    }
}
