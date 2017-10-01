package com.kodilla.good.patterns.challenges.Food2DoorV2;

import java.time.LocalDateTime;
import java.util.HashMap;

public class ExtraFoodShop implements Producer {

    public boolean process() {

        LocalDateTime requestDate = LocalDateTime.of(2017, 9, 25, 10, 55);

        HashMap<String, Integer> productList = new HashMap<>();
        productList.put("Milk", 80);
        productList.put("Eggs", 120);
        productList.put("Butter", 100);

        return true;
    }
}
