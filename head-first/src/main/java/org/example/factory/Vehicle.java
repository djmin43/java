package org.example.factory;

public abstract class Vehicle {
    String name;

    void drive() {
        System.out.println("driving" + getName());
    }
    void park() {
        System.out.println("parking" + getName());
    };

    public String getName() {
        return name;
    }
}
