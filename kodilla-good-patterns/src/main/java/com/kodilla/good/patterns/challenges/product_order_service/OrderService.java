package com.kodilla.good.patterns.challenges.product_order_service;

import java.time.LocalDateTime;

public interface OrderService {

    boolean order(User partner, LocalDateTime orderDate);
}
