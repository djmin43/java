package org.example.factory;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("에단이 주문한" + pizza.getName() );
    }
}
