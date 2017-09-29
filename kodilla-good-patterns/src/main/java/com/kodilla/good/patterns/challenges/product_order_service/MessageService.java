package com.kodilla.good.patterns.challenges.product_order_service;

public class MessageService implements InformationService {

    public void inform(User user) {
        System.out.println("Order has been successfully placed.");

    }
}
