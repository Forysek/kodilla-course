package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class LoveDecorator extends AbstractPizzaOrderDecorator {
    public LoveDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(6));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", extra love";
    }
}
