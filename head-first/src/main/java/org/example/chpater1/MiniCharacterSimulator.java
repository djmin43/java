package org.example.chpater1;

public class MiniCharacterSimulator {

    public static void main(String[] args) {

        King king = new King();
        king.fight();
        king.setWeaponBehavior(new SwordBehavior());
        king.fight();
    }
}
