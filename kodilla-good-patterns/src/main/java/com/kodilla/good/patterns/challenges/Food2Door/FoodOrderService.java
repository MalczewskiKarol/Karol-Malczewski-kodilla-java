package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;
import java.util.HashMap;

public class FoodOrderService implements OrderStatus {

    public boolean order(final Partner partner, final LocalDateTime orderDate, final HashMap<String, Integer> productList) {
        System.out.println("Order has been created by: " + partner.getCompanyName() + " at: " + orderDate + "and equals: " + productList);

        return true;
    }
}
