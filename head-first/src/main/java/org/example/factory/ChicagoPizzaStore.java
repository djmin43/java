package org.example.factory;

public class ChicagoPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new CheesePizza();
        }
        if (item.equals("pepperoni")) {
            return new PepperoniPizza();
        }
        return new GreekPizza();
    }
}
