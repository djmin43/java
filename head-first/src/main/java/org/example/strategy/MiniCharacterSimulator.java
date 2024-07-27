package org.example.strategy;

public class MiniCharacterSimulator {

    public static void main(String[] args) {

        King king = new King();
        king.fight();
        king.setWeaponBehavior(new KnifeBehavior());
        king.fight();
    }
}
