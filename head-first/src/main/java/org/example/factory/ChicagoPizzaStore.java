package org.example.factory;

public class ChicagoPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
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
