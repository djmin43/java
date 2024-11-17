package org.example.collection;


import java.util.List;

public class PancakeHouseIterator implements Iterator {

    int position = 0;
    List<MenuItem> menuItems;

    public PancakeHouseIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public MenuItem next() {
        return menuItems.get(position++);
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size();
    }

}
