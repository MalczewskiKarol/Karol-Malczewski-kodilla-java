package com.kodilla.good.patterns.challenges.product_order_service;

public class User {
    private String userName;
    private String realName;
    private String adress;

    public User(final String userName, final String realName, final String adress) {
        this.userName = userName;
        this.realName = realName;
        this.adress = adress;
    }

    public String getUserName() {
        return userName;
    }

    public String getRealName() {
        return realName;
    }

    public String getAdress() {
        return adress;
    }
}
