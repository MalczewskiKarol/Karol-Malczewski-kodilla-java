package com.kodilla.good.patterns.challenges.Food2DoorV2;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Order {
    private Partner partner;
    private LocalDateTime requestDate;
    private HashMap<String, Integer> productList;

    public Order(final Partner partner, final LocalDateTime requestDate, final HashMap<String, Integer> productList) {
    }

    public Partner getPartner() {
        return partner;
    }

    public LocalDateTime getRequestDate() {
        return requestDate;
    }

    public HashMap<String, Integer> getProductList() {
        return productList;
    }
}
