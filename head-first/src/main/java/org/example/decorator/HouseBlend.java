package org.example.decorator;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House HouseBlend";
    }

    public double cost() {
        return .89;
    }
}
