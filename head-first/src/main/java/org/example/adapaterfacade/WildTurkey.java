package org.example.adapaterfacade;

public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("GOBBLE");
    }

    public void fly() {
        System.out.println("FLY SHORT");
    }
}
