package org.example.poly.ex5;

public class Cat implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("meow");
    }

    @Override
    public void move() {
        System.out.println("moving cat");
    }
}
