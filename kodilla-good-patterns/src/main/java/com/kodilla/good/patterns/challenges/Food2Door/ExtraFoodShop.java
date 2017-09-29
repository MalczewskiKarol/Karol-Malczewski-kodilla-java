package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;
import java.util.HashMap;

public class ExtraFoodShop {
    public FoodOrderRequest request() {
        Partner partner = new Partner("ExtraFoodShop", "ul. Krzywa 5 / 00-971 Warszawa");

        LocalDateTime requestDate = LocalDateTime.of(2017, 9, 25, 10, 55);

        HashMap<String, Integer> productList = new HashMap<>();
        productList.put("Milk", 80);
        productList.put("Eggs", 120);
        productList.put("Butter", 100);

        return new FoodOrderRequest(partner, requestDate, productList);
    }
}