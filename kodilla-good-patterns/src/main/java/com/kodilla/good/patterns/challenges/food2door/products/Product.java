package com.kodilla.good.patterns.challenges.food2door.products;

public class Product{
    private String productName;
    private String productOrigin;

    public Product(String productName, String productOrigin){
        this.productName = productName;
        this.productOrigin = productOrigin;
    }

    public String getProductName(){
        return productName;
    }

    @Override
    public String toString(){
        return "Product{" +
                "'" + productName + '\'' +
                ", origin of the product: '" + productOrigin + '\'' +
                '}';
    }
}
