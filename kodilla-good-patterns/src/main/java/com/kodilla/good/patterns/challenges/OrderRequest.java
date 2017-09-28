package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    public User user;
    public LocalDateTime orderDate;

    public OrderRequest(final User user, final LocalDateTime orderDate) {
        this.user = user;
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }
}
