package org.example.chpater1;

public class Dog implements Animal {

    @Override
    public void makeSound() {
        bark();
    }

    public void bark() {
        System.out.println("bark");
    }
}
