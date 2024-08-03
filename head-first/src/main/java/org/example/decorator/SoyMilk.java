package org.example.decorator;

public class SoyMilk extends CondimentDecorator {

    public SoyMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", soy milk";
    }

    public double cost() {
        return this.beverage.cost() + .15;
    }
}
