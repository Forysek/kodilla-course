package com.kodilla.good.patterns.challenges.internet.shop.product;

public class Product {
    private String storeId;
    private String productName;
    private String productType;

    public Product(String storeId, String productName, String productType) {
        this.storeId = storeId;
        this.productName = productName;
        this.productType = productType;
    }

    public String getStoreId() {
        return storeId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductType() {
        return productType;
    }
}
