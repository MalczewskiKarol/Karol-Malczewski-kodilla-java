package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class FoodOrderRequest {
    public Partner partner;
    public LocalDateTime orderDate;
    private HashMap<String, Integer> productList;

    public FoodOrderRequest(final Partner partner, final LocalDateTime orderDate, final HashMap<String, Integer> productList) {
        this.partner = partner;
        this.orderDate = orderDate;
        this.productList = productList;
    }

    public Partner getPartner() {
        return partner;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public HashMap<String, Integer> getProductList() {
        return productList;
    }
}