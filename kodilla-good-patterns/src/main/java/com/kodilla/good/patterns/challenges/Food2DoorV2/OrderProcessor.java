package com.kodilla.good.patterns.challenges.Food2DoorV2;

public class OrderProcessor {
    private Producer producer;
    private Information information;

    public OrderProcessor(final Producer producer, final Information information) {
        this.producer = producer;
        this.information = information;
    }

    public OrderDto process(final Order order) {

        return new OrderDto(producer, true);


    }
}
