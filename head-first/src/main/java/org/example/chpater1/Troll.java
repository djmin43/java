package org.example.chpater1;

public class Troll extends Character {

    public Troll() {
        this.weaponBehavior = new AxeBehavior();
    }

    @Override
    public void display() {
        System.out.println("I am a troll");

    }
}
