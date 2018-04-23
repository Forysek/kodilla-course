package com.kodilla.good.patterns.challenges.food2door.stores;

import com.kodilla.good.patterns.challenges.food2door.interfaces.StoresInterface;
import com.kodilla.good.patterns.challenges.food2door.products.Product;

public class HealthyShop implements StoresInterface{
    private Product product;
    private double productPrice;
    private double productAmount;

    public HealthyShop(Product product, double productPrice, double productAmount){
        this.product = product;
        this.productPrice = productPrice;
        this.productAmount = productAmount;
    }

    public Product getProduct(){
        return product;
    }

    public double getProductPrice(){
        return productPrice;
    }

    public double getProductAmount(){
        return productAmount;
    }

    @Override
    public void process(){
        if(productAmount >= 100 || productPrice >= 20){
            double priceToPay = productAmount * productPrice;
            System.out.println("Total amount for your order of " + getProduct() +
                    " x " + getProductAmount() + " is " + priceToPay);
        } else {
            System.out.println("Inappropriate amount - processing only 100 or more or with price larger than 20");
        }
    }
}


