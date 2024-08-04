package org.example.factory;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYIngredientFactory();
        if (item.equals("cheese")) {
            return new CheesePizza(pizzaIngredientFactory);
        }
        if (item.equals("pepperoni")) {
            return new PepperoniPizza(pizzaIngredientFactory);
        }
        return new GreekPizza(pizzaIngredientFactory);
    }
}
