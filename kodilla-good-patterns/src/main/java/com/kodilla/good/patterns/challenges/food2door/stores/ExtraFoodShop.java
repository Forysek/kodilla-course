package com.kodilla.good.patterns.challenges.food2door.stores;

import com.kodilla.good.patterns.challenges.food2door.interfaces.StoresInterface;
import com.kodilla.good.patterns.challenges.food2door.products.Product;

public class ExtraFoodShop implements StoresInterface{
    private Product product;
    private double productPrice;
    private double productAmount;

    public ExtraFoodShop(Product product, double productPrice, double productAmount){
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
        double priceToPay = productPrice * productAmount;

        System.out.println("Total amount for your order of " + getProduct() +
                " x " + getProductAmount() + " is " + priceToPay);
    }
}
