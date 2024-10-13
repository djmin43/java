package org.example.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {

    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();
        addItem("Egg Pancake", "pancake with some scrambled egg", true, 2.99);
        addItem("Regular Pancake", "pancake with some regular stuff", false, 4.99);
        addItem("Waffle", "waffle here I come", true, 22.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
