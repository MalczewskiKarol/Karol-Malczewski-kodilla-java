package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;
import java.util.HashMap;

public class GlutenFreeShop {

    public FoodOrderRequest request() {
        Partner partner = new Partner("Gluten Free Shop", "ul. Chrobrego 11 / 00-421 Warszawa");

        LocalDateTime requestDate = LocalDateTime.of(2017, 8, 29, 14, 17);

        HashMap<String, Integer> productList = new HashMap<>();
        productList.put("Bread", 90);
        productList.put("Roll", 2700);
        productList.put("Flour", 50);

        return new FoodOrderRequest(partner, requestDate, productList);
    }
}
