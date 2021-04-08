package com.company;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage) {
        super(beverage);
    }
    @Override
    public double cost() {
        return super.cost() + getCondimentCost();
    }
    private double getCondimentCost(){
        return 0.25;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " with " + getCondimentName();
    }
    private String getCondimentName(){
        return "soy";
    }
}
