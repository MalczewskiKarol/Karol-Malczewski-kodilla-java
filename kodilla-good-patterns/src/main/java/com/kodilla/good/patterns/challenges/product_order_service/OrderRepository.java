package com.kodilla.good.patterns.challenges.product_order_service;

import java.time.LocalDateTime;

public interface OrderRepository {

   void createOrder(User user, LocalDateTime orderDate);
}
