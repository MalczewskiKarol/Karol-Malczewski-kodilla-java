package com.kodilla.patterns2.decorator.pizza;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetPrice() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        //When
        BigDecimal price = order.getPrice();

        //Then
        assertEquals(new BigDecimal(15), price);
    }

    @Test
    public void testBasicPizzaOrderGetComponents() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        //When
        String components = order.getComponents();

        //Then
        assertEquals("pizza dough + tomato sauce + cheese", components);

    }

    @Test
    public void testBasicPizzaOrderExtraCheeseGetPrice() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new ExtraCheese(order);

        //When
        BigDecimal price = order.getPrice();

        //Then
        assertEquals(new BigDecimal(18), price);
    }

    @Test
    public void testBasicPizzaOrderExtraCheeseGetDescription() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new ExtraCheese(order);

        //When
        String description = order.getDescription();

        //Then
        assertEquals("Basic pizza menu with double cheese", description);
    }

    @Test
    public void testBasicPizzaOrderExtraCheeseWithChickenGetPrice() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new ExtraCheese(order);
        order = new ExtraChicken(order);
        System.out.println(order.getPrice());
        //When
        BigDecimal price = order.getPrice();

        //Then
        assertEquals(new BigDecimal(23), price);
    }

    @Test
    public void testBasicPizzaOrderExtraCheeseWithChickenGetComponents() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new ExtraChicken(order);
        order = new ExtraCheese(order);
        System.out.println(order.getComponents());

        //When
        String components = order.getComponents();

        //Then
        assertEquals("pizza dough + tomato sauce + cheese + extra chicken + extra cheese", components);
    }
}
