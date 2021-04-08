package com.company;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage){
        super(beverage);
    }
    @Override
    public double cost() {
        return super.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
