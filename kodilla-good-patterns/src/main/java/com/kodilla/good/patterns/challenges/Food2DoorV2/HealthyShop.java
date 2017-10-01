package com.kodilla.good.patterns.challenges.Food2DoorV2;

import java.time.LocalDateTime;
import java.util.HashMap;

public class HealthyShop implements Producer {

    public Order process() {

        LocalDateTime requestDate = LocalDateTime.of(2017, 9, 5, 13, 21);

        HashMap<String, Integer> productList = new HashMap<>();
        productList.put("Ham", 110);
        productList.put("Meat", 220);
        productList.put("Sausage", 150);

        return new Order(requestDate, productList);
    }
}
