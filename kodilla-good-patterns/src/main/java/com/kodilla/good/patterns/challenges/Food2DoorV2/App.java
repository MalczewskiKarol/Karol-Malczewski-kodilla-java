package com.kodilla.good.patterns.challenges.Food2DoorV2;

public class App {
    public static void main(String[] args) {

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        HealthyShop healthyShop = new HealthyShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();

        OrderDto orderDto = new OrderDto(extraFoodShop, true);
        OrderDto orderDto1 = new OrderDto(healthyShop, true);
        OrderDto orderDto2 = new OrderDto(glutenFreeShop, true);

        OrderProcessor orderProcessor = new OrderProcessor(extraFoodShop, new InformationShop());
        OrderProcessor orderProcessor1 = new OrderProcessor(healthyShop, new InformationShop());
        OrderProcessor orderProcessor2 = new OrderProcessor(glutenFreeShop, new InformationShop());

        Order order = new Order(extraFoodShop.process().getRequestDate(), extraFoodShop.process().getProductList());
        Order order1 = new Order(healthyShop.process().getRequestDate(), healthyShop.process().getProductList());
        Order order2 = new Order(glutenFreeShop.process().getRequestDate(), glutenFreeShop.process().getProductList());

    }
}
