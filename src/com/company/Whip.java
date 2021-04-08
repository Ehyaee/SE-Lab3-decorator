package com.company;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage){
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with " + getCondimentName();
    }

    private String getCondimentName(){
        return "whip";
    }

    @Override
    public double cost() {
        return super.cost() + getCondimentCost();
    }

    private double getCondimentCost(){
        return 0.10;
    }
}

