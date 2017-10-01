package com.kodilla.good.patterns.challenges.Food2DoorV2;

public class OrderDto {
    public Producer producer;
    public boolean isOrdered;

    public OrderDto(final Producer producer, final boolean isOrdered) {
        this.producer = producer;
        this.isOrdered = isOrdered;
    }

    public Producer getProducer() {
        return producer;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
