package com.company;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage){
        super(beverage);
    }
    @Override
    public double cost() {
        return super.cost() + getCondimentCost();
    }

    private double getCondimentCost(){
        return 0.20;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with " + getCondimentName();
    }

    private String getCondimentName(){
        return "mocha";
    }
}
