package org.example.factory;

public abstract class PizzaStore {

    Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = this.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
