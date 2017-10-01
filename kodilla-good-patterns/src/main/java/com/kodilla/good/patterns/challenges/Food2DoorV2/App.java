package com.kodilla.good.patterns.challenges.Food2DoorV2;

import java.time.LocalDateTime;
import java.util.HashMap;

public class App {

    public static void main(String[] args) {

    ExtraFoodShop extraFoodShop = new ExtraFoodShop();

    OrderProcessor orderProcessor = new OrderProcessor(extraFoodShop, new InformationShop());

    HashMap<String, Integer> productsToBuy = new HashMap<>();
    productsToBuy.put("Milk", 2);

    Order order = new Order(LocalDateTime.now(), productsToBuy);

    OrderDto processedOrder = orderProcessor.process(order);

    if(processedOrder.isProcessed()) {
        System.out.println("Order was processed");
        }
    }
}
