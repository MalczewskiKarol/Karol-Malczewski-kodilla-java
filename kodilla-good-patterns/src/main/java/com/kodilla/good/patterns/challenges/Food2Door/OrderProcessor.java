package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderProcessor {
    private OrderInformation orderInformation;
    private OrderStatus orderStatus;
    private OrderCreator orderCreator;

    public OrderProcessor(final OrderInformation orderInformation, final OrderStatus orderStatus, final OrderCreator orderCreator) {
        this.orderInformation = orderInformation;
        this.orderStatus = orderStatus;
        this.orderCreator = orderCreator;
    }

    public FoodOrderDto process(final FoodOrderRequest foodOrderRequest) {
        boolean isOrdered = orderStatus.order(foodOrderRequest.getPartner(), foodOrderRequest.getOrderDate(), foodOrderRequest.getProductList());

        if(isOrdered) {
            orderInformation.inform(foodOrderRequest.getPartner());
            orderCreator.createOrder(foodOrderRequest.getPartner(), foodOrderRequest.getOrderDate());

            return new FoodOrderDto(foodOrderRequest.getPartner(), true);
        } else {
            return new FoodOrderDto(foodOrderRequest.getPartner(), false);
        }
    }
}