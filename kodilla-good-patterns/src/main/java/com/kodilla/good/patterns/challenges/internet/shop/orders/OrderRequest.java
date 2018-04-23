package com.kodilla.good.patterns.challenges.internet.shop.orders;

public class OrderRequest {
    private String orderName;
    private String orderType;

    public OrderRequest(String orderName, String orderType) {
        this.orderName = orderName;
        this.orderType = orderType;
    }

    public String getOrderName() {
        return orderName;
    }

    public String getOrderType() {
        return orderType;
    }
}
