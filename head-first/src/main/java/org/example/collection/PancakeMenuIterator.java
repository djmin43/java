package org.example.collection;


import java.util.ArrayList;

public class PancakeMenuIterator implements Iterator {
    ArrayList<MenuItem> items;
    int position = 0;


    public PancakeMenuIterator(ArrayList<MenuItem> menuItems) {
        this.items = menuItems;
    }

    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }
}
