package org.example.decorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", mocha";
    }
    public double cost() {
        return this.beverage.cost();
    }
}
