package com.kodilla.good.patterns.challenges.internet.shop;

import com.kodilla.good.patterns.challenges.internet.shop.orders.OrderProcessor;
import com.kodilla.good.patterns.challenges.internet.shop.fillers.ProductFiller;
import com.kodilla.good.patterns.challenges.internet.shop.fillers.RequestFiller;
import com.kodilla.good.patterns.challenges.internet.shop.orders.OrderHistory;
import com.kodilla.good.patterns.challenges.internet.shop.orders.OrderRequest;
import com.kodilla.good.patterns.challenges.internet.shop.product.Product;

import java.util.Map;

public class ProductOrderService {
    public static void main(String[] args) {

        ProductFiller productFiller = new ProductFiller();
        Map<String, Product> products = productFiller.fillProducts();

        RequestFiller requestFiller = new RequestFiller();
        OrderRequest newRequest = requestFiller.requestOrder();
        OrderProcessor orderProcessor = new OrderProcessor( products );
        orderProcessor.process(newRequest);
        OrderHistory orderHistory = orderProcessor.newOrderHistory(newRequest);
        orderHistory.addOrderToHistory(orderHistory);

        System.out.println("Size of orders history: " + orderHistory.allOrdersHistory.size());
        System.out.println("First order in the queue of orders history: " + orderHistory.allOrdersHistory.peek());
    }
}