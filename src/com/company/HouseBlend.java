package com.company;

public class HouseBlend implements Beverage {

    @Override
    public double cost() {
        return 0.89;
    }

    @Override
    public String getDescription() {
        return "Delicious HouseBlend";
    }
}
