package org.example.decorator;

public class WhippedCream extends CondimentDecorator {

    public WhippedCream(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Whipped Cream";
    }

    public double cost() {
        return this.beverage.cost() + .10;
    }
}
