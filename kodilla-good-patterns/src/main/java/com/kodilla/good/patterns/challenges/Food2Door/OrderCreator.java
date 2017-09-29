package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public interface OrderCreator {
    void createOrder(Partner partner, LocalDateTime orderDate);
}
