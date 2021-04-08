package com.company;

public class SteamedMilk extends CondimentDecorator{
    public SteamedMilk(Beverage beverage){
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with " + getCondimentName();
    }

    private String getCondimentName(){
        return "milk";
    }
    @Override
    public double cost() {
        return super.cost() + getCondimentCost();
    }

    private double getCondimentCost(){
        return 0.10;
    }
}
