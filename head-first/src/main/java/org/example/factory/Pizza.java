package org.example.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    String[] veggies;
    String cheese;
    String peppers;
    String clams;

    abstract void prepare();

    void bake() {
        System.out.println("175도에서 25분 간 굽기");
    }

    void cut() {
        System.out.println("피자를 사선으로 자르기");
    }

    void box() {
        System.out.println("상자에 피자 담기");
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return getName();
    }
}
