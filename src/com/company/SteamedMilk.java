package com.company;

public class SteamedMilk extends CondimentDecorator{
    public SteamedMilk(Beverage beverage){
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public double cost() {
        return super.cost();
    }
}
