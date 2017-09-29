package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.List;
import java.util.Map;

public class Partner {
    private String companyName;
    private String adress;

    public Partner(final String companyName, final String adress) {
        this.companyName = companyName;
        this.adress = adress;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAdress() {
        return adress;
    }
}