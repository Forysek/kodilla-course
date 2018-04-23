package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.products.Product;
import com.kodilla.good.patterns.challenges.food2door.stores.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.stores.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.food2door.stores.HealthyShop;

public class Food2DoorMain{

    public static void main(String args[]){

        Product divineTomatoes = new Product("Tomatoes", "Israel");
        Product linseedOfChina = new Product("Linseed", "China");
        Product straightFromUSA = new Product("Cornbread", "USA");

        ExtraFoodShop extraFoodShop1 = new ExtraFoodShop(linseedOfChina, 3.99d, 80.0d);
        HealthyShop healthyShop1 = new HealthyShop(divineTomatoes, 4.99d, 20.0d);
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop(straightFromUSA, 8.99d, 50.0d);

        extraFoodShop1.process();
        healthyShop1.process();
        glutenFreeShop.process();

    }
}
