package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public interface OrderStatus {
    boolean order(Partner partner, LocalDateTime orderDate, HashMap<String, Integer> productList);
}
