package org.example.chpater1;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public Character() {}

    public void fight() {
        weaponBehavior.useWeapon();
    }

    public abstract void display();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

}
