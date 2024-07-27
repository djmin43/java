package org.example.strategy;

public class King extends Character {

    public King() {
        this.weaponBehavior = new BowAndArrowBehavior();
    }

    public void display() {
        System.out.println("King");
    }
}
