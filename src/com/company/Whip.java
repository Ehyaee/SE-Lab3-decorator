package com.company;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage){
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

