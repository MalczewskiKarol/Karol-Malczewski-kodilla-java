package com.kodilla.good.patterns.challenges.product_order_service;

public class OrderDtoService {
    public User user;
    public boolean isOrdered;

    public OrderDtoService(final User user, final boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
