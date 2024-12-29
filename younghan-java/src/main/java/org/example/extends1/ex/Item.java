package org.example.extends1.ex;

import org.w3c.dom.ls.LSOutput;

public class Item {
    private String name;
    private int price;

    public Item(String name, int prince) {
        this.name = name;
        this.price = prince;
    }

    public int getPrice() {
        return price;
    }

    public void print() {
        System.out.println("name :" + name + ", price: " + price);
    }


}
