package com.kodilla.good.patterns.challenges.Food2DoorV2;

public class OrderDto {
    public Producer producer;
    public boolean isProcessed;

    public OrderDto(final Producer producer, final boolean isProcessed) {
        this.producer = producer;
        this.isProcessed = isProcessed;
    }

    public Producer getProducer() {
        return producer;
    }

    public boolean isProcessed() {
        return isProcessed;
    }
}
