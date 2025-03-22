package org.example.poly.ex6;

public class Bird extends AbstractAnimal implements Fly {

    @Override
    public void sound() {
        System.out.println("chipchip");

    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
}
