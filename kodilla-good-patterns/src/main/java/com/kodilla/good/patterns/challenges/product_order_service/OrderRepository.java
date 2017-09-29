package com.kodilla.good.patterns.challenges.product_order_service;

import com.kodilla.good.patterns.challenges.Food2Door.Partner;

import java.time.LocalDateTime;

public interface OrderRepository {

   void createOrder(User user, LocalDateTime orderDate);
}
