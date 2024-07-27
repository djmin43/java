package org.example.chpater1;

public class Knight extends Character {
    public Knight() {
        this.weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void display() {
        System.out.println("I am a knight!");

    }
}
