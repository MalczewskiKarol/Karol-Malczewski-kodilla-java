package com.kodilla.good.patterns.challenges.Food2DoorV2;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Order {
    private LocalDateTime requestDate;
    private HashMap<String, Integer> productList;

    public Order(final LocalDateTime requestDate, final HashMap<String, Integer> productList) {
        this.requestDate = requestDate;
        this.productList = productList;
    }

    public LocalDateTime getRequestDate() {
        return requestDate;
    }

    public HashMap<String, Integer> getProductList() {
        return productList;
    }
}
