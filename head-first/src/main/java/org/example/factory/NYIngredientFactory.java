package org.example.factory;

public class NYIngredientFactory implements PizzaIngredientFactory {
    @Override
    public String createDough() {
        return "ny dough";
    }

    @Override
    public String createSauce() {
        return "ny sauce";
    }

    @Override
    public String createCheese() {
        return "ny cheese";
    }

    @Override
    public String createClams() {
        return "ny clams";
    }

    @Override
    public String[] createVeggies() {
        return new String[] {"ny veggies"};
    }

    @Override
    public String[] createPeppers() {
        return new String[] {"ny peppers"};
    }
}
