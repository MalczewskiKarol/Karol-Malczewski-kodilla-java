package com.kodilla.good.patterns.challenges.Food2Door;

public class FoodOrderDto {
    public Partner partner;
    public boolean isOrdered;

    public FoodOrderDto(final Partner partner, final boolean isOrdered) {
        this.partner = partner;
        this.isOrdered = isOrdered;
    }

    public Partner getPartner() {
        return partner;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
