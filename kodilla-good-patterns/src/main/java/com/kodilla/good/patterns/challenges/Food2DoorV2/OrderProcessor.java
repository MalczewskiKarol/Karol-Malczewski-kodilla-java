package com.kodilla.good.patterns.challenges.Food2DoorV2;

public class OrderProcessor {
    private Producer producer;
    private Information information;

    public OrderProcessor(final Producer producer, final Information information) {
        this.producer = producer;
        this.information = information;
    }

    public OrderDto process(final Order order) {
        boolean isProcessed = producer.process();

        if(isProcessed) {
            return new OrderDto(producer, true);
        } else {
            return new OrderDto(producer, false);
        }

    }

}
