package com.kodilla.good.patterns.challenges.Food2DoorV2;

import java.time.LocalDateTime;
import java.util.HashMap;

public class GlutenFreeShop implements Producer {

    public boolean process() {

        LocalDateTime requestDate = LocalDateTime.of(2017, 8, 29, 14, 17);

        HashMap<String, Integer> productList = new HashMap<>();
        productList.put("Bread", 90);
        productList.put("Roll", 2700);
        productList.put("Flour", 50);

        return true;
    }
}
