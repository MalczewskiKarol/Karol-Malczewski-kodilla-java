package com.kodilla.good.patterns.challenges.Food2Door;

import com.kodilla.good.patterns.challenges.product_order_service.OrderRequest;

public class App {
    public static void main(String[] args) {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        HealthyShop healthyShop = new HealthyShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();

        FoodOrderRequest foodOrderRequest = new ExtraFoodShop().request();
        FoodOrderRequest foodOrderRequest2 = new HealthyShop().request();
        FoodOrderRequest foodOrderRequest1 = new GlutenFreeShop().request();

        OrderProcessor orderProcessor = new OrderProcessor(new MessageService(), new FoodOrderService(), new FoodOrderRepository());

        orderProcessor.process(foodOrderRequest);
        orderProcessor.process(foodOrderRequest1);
        orderProcessor.process(foodOrderRequest2);
    }
}
