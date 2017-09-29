package com.kodilla.good.patterns.challenges.product_order_service;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("user1", "Artur Rohde", "Poznan ul.Koralowa 3");

        LocalDateTime orderDate = LocalDateTime.of(2017, 9, 25, 16, 22);

        return new OrderRequest(user, orderDate);
    }
}
