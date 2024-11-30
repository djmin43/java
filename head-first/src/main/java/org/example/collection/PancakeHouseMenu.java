package org.example.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu {

    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("K&B pancake set", "Scrambled eggs and some pancakes", true, 2.99);
        addItem("Regular Pancake Set", "Pancakes with fried eggs, sausage", false, 3.49);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.99);
        addItem("Waffles", "Waffles with your choice of blueberries or strawberries", true, 4.49);
    }


    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }



}
