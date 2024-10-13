package org.example.collection;

import java.util.Iterator;

public class DinnerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinnerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("sorry, ran out of max items");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public Iterator createIterator() {
        return new DinnerMenuIterator(menuItems);
    }
}
