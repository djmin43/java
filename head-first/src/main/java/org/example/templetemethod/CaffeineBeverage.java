package org.example.templetemethod;

public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("boil water");
    }

    void pourInCup() {
        System.out.println("pout in cup");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}
