package com.kodilla.good.patterns.challenges.product_order_service;

import com.kodilla.good.patterns.challenges.Food2Door.Partner;

import java.time.LocalDateTime;

public interface OrderService {

    boolean order(User partner, LocalDateTime orderDate);
}
