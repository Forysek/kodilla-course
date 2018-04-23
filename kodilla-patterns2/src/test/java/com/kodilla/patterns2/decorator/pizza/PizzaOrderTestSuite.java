package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testGetPizzaWithAllIngredientsCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ChivesDecorator(pizzaOrder);
        pizzaOrder = new BaconDecorator(pizzaOrder);
        pizzaOrder = new LoveDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getCost());

        //When
        BigDecimal pizzaCost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(27), pizzaCost);
    }

    @Test
    public void testGetPizzaWithAllIngredientsDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ChivesDecorator(pizzaOrder);
        pizzaOrder = new BaconDecorator(pizzaOrder);
        pizzaOrder = new LoveDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getIngredients());

        //When
        String pizzaDescription = pizzaOrder.getIngredients();

        //Then
        assertEquals("Tomato sauce, cheese, chives, bacon, extra love", pizzaDescription);

    }
}
