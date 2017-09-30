package com.kodilla.good.patterns.challenges.Food2DoorV2;

public class Dto {
    public Partner partner;
    public boolean isOrdered;

    public Dto(final Partner partner, final boolean isOrdered) {
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
