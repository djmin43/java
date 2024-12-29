package org.example.extends1.overriding;

public class ElectricCar extends Car {

    @Override
    public void move() {
        System.out.println("move fast");
    }

    public void charge() {
        System.out.println("charge");
    }
}
