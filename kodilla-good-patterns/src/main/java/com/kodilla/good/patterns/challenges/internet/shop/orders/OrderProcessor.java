package com.kodilla.good.patterns.challenges.internet.shop.orders;

import com.kodilla.good.patterns.challenges.internet.shop.product.Product;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderProcessor {

    private Map<String, Product> products;


    public OrderProcessor(Map<String, Product> products) {
        this.products = products;
    }

    public void process(OrderRequest orderRequest){
        if (products.get(getRequestedProductStoreId(orderRequest)) != null) {
            System.out.println(orderRequest.getOrderName() + " bought.");
        } else {
            System.out.println("Sorry, we don't have " + orderRequest.getOrderName() + " in stock.");

        }
    }
  
    public OrderHistory newOrderHistory(OrderRequest orderRequest){
        return new OrderHistory(products.get(getRequestedProductStoreId(orderRequest)), LocalDate.now());
    }

    private String getRequestedProductStoreId(OrderRequest orderRequest) {
        String retrievedStoreId = products.entrySet().stream()
                .map(m -> m.getValue())
                .filter(f -> f.getProductName().equals(orderRequest.getOrderName()))
                .filter( f -> f.getProductType().equals(orderRequest.getOrderType()))
                .map(m -> m.getStoreId())
                .collect( Collectors.joining() );
        return retrievedStoreId;
    }
}
