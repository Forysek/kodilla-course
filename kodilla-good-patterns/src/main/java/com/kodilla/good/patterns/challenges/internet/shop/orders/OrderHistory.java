package com.kodilla.good.patterns.challenges.internet.shop.orders;

import com.kodilla.good.patterns.challenges.internet.shop.product.Product;

import java.time.LocalDate;
import java.util.ArrayDeque;

public class OrderHistory{
    private Product product;
    private LocalDate localDate;
    public ArrayDeque<OrderHistory> allOrdersHistory = new ArrayDeque<>();

    public OrderHistory(Product product, LocalDate localDate){
        this.product = product;
        this.localDate = localDate;
    }

    @Override
    public String toString(){
        return "OrderHistory{" +
                "product=" + product.getProductName() +
                ", localDate=" + localDate +
                '}';
    }

    public void addOrderToHistory(OrderHistory orderHistory){
        allOrdersHistory.offer(orderHistory);
    }
}
