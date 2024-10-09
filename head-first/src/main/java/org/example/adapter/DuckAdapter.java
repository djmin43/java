package org.example.adapter;

public class DuckAdapter implements Turkey {
    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    public void gobble() {
        this.duck.quack();
    }

    public void fly() {
        this.duck.fly();
    }
}
