package org.example.decorator;

public class Decaf extends Beverage {

    public Decaf() {
        this.description = "decaf";
    }

    public double cost() {
        return 1.05;
    }
}
