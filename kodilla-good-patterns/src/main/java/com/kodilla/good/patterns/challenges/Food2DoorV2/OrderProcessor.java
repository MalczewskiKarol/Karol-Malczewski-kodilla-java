package com.kodilla.good.patterns.challenges.Food2DoorV2;

import java.time.LocalDateTime;
import java.util.HashMap;

public class OrderProcessor {
    private Producer producer;
    private Information information;

    public OrderProcessor(final Producer producer, final Information information) {
        this.producer = producer;
        this.information = information;
    }

    public OrderDto process(Order order) {

        return new OrderDto(producer, true);

    }
}
