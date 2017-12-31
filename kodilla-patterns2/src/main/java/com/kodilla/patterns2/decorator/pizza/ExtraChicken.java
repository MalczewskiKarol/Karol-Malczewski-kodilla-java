package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraChicken extends AbstractPizzaOrderDecorator {
    public ExtraChicken(PizzaOrder pizzaOrder) {
    super(pizzaOrder);
}

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(5));
    }

    @Override
    public String getComponents() {
        return super.getComponents() + " + extra chicken";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " and chicken";
    }
}