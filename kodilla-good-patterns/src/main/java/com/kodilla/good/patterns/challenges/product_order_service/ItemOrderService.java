package com.kodilla.good.patterns.challenges.product_order_service;

import java.time.LocalDateTime;

public class ItemOrderService implements OrderService {

    public boolean order(final User user, final LocalDateTime orderDate) {
        System.out.println("Order has been created by: " + user.getUserName() + " at: " + orderDate);

        return true;
    }
}
