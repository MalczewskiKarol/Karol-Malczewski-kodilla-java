package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = new OrderRequestRetriever().retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new MessageService(), new ItemOrderService(), new ItemOrderRepository());

        productOrderService.process(orderRequest);
    }
}
