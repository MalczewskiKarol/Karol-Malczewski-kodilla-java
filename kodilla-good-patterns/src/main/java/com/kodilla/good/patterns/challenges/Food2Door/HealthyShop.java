package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;
import java.util.HashMap;

public class HealthyShop {
    public FoodOrderRequest request() {
        Partner partner = new Partner("Healthy Shop", "ul. Prosta 6 / 00-951 Warszawa");

        LocalDateTime requestDate = LocalDateTime.of(2017, 9, 5, 13, 21);

        HashMap<String, Integer> productList = new HashMap<>();
        productList.put("Ham", 110);
        productList.put("Meat", 220);
        productList.put("Sausage", 150);

        return new FoodOrderRequest(partner, requestDate, productList);
    }
}