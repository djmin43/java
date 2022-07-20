package com.java.OOPClass;

public class Monster {

    public final String TOMBSTONE = "Here Lies a Dead monster";
    private final int attack = 20;
    private final int movement = 2;
    private final int xPosition = 0;
    private final int yPosition = 0;
    public String name = "Big Monster";
    private int health = 500;
    private boolean alive = true;

    public int getAttack() {
        return attack;
    }

    public int getMovement() {
        return movement;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int decreaseHealth) {
        health = health - decreaseHealth;
        if (health < 0) {
            alive = false;
        }
    }

    public void setHealth(double decreaseHealth) {
        int intDecreaseHealth = (int) decreaseHealth;
        health = health - intDecreaseHealth;
        if (health < 0) {
            alive = false;
        }

    }

}
