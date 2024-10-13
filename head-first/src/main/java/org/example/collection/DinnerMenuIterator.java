package org.example.collection;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinnerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Remove is not supported");
    }
}
