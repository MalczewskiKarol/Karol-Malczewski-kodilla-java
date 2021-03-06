package com.kodilla.good.patterns.challenges.product_order_service;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService, final OrderService orderService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDtoService process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(),orderRequest.getOrderDate());

        if(isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getOrderDate());

            return new OrderDtoService(orderRequest.getUser(), true);
        } else {
            return new OrderDtoService(orderRequest.getUser(), false);
        }
    }
}
