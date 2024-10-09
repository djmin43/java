package org.example.templetemethod;

public class Tea extends CaffeineBeverage {


    public void brew() {
        this.steepTeaBag();
    }

    public void addCondiments() {
        this.addLemon();
    }

    void steepTeaBag() {
        System.out.println("steep tea bag");
    }

    void addLemon() {
        System.out.println("add lemon");
    }


}
