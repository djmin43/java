package org.example.factory;

public class PepperoniPizza extends Pizza {

    public PepperoniPizza() {
        name ="pepperoni 피자";
        dough ="씬 크러스트 도우";
        sauce ="토마토 소스";
        toppings.add("페퍼로니");
    }

    void cut() {
        System.out.println("안자르고 먹기");
    }
}
