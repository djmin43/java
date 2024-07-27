package org.example.chpater1;

public class King extends Character {

    public King() {
        this.weaponBehavior = new BowAndArrowBehavior();
    }

    public void display() {
        System.out.println("King");
    }
}
