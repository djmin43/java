package org.example.strategy;

public class Queen extends Character {
    public Queen() {
        this.weaponBehavior = new SwordBehavior();
    }

    public void display() {
        System.out.println("Queen");
    }
}
