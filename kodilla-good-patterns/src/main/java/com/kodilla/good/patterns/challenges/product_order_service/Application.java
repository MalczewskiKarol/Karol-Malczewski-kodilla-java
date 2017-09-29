package com.kodilla.good.patterns.challenges.product_order_service;

public class Application {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = new OrderRequestRetriever().retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new MessageService(), new ItemOrderService(), new ItemOrderRepository());

        productOrderService.process(orderRequest);
    }
}