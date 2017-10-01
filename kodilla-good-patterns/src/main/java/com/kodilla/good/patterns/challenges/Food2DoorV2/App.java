package com.kodilla.good.patterns.challenges.Food2DoorV2;

public class App {
    public static void main(String[] args) {

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        HealthyShop healthyShop = new HealthyShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();

        Order order = new ExtraFoodShop().process();
        Order order1 = new HealthyShop().process();
        Order order2 = new GlutenFreeShop().process();

        OrderProcessor orderProcessor = new OrderProcessor(extraFoodShop, new InformationShop());
        OrderProcessor orderProcessor1 = new OrderProcessor(healthyShop, new InformationShop());
        OrderProcessor orderProcessor2 = new OrderProcessor(glutenFreeShop, new InformationShop());

        orderProcessor.process(order);
        orderProcessor1.process(order1);
        orderProcessor2.process(order2);

    }
}
