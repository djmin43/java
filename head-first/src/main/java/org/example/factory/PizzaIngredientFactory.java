package org.example.factory;

public interface PizzaIngredientFactory {
    public String createDough();
    public String createSauce();
    public String createCheese();
    public String createClams();
    public String[] createVeggies();
    public String[] createPeppers();
}
