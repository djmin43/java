package org.example.factory;

public class SimplePizzaFactory implements PizzaFactory {

    public Pizza createPizza(String type) {
        PizzaIngredientFactory pizzaIngredientFactory = new NYIngredientFactory();
        if (type.equals("cheese")) {
            return new CheesePizza(pizzaIngredientFactory);
        }
        if (type.equals("pepperoni")) {
            return new PepperoniPizza(pizzaIngredientFactory);
        }
        return new GreekPizza(pizzaIngredientFactory);
    }

}
