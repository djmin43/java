package org.example.strategy;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("silent...");
    }
}
