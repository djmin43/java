package org.example.factory;

public class SimplePizzaFactory implements PizzaFactory {

    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CheesePizza();
        }
        if (type.equals("pepperoni")) {
            return new PepperoniPizza();
        }
        return new GreekPizza();
    }

}
