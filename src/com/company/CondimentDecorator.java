package com.company;



    public class CondimentDecorator implements Beverage {
        private Beverage _beverage;

        CondimentDecorator(Beverage beverage){
            this._beverage = beverage;
        }

        private Beverage getBeverage(){
            return _beverage;
        }

        @Override
        public String getDescription() {
            return getBeverage().getDescription();
        }

        @Override
        public double cost() {
            return getBeverage().cost();
        }
    }
