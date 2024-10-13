package org.example.collection;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinnerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        Iterator dinnerIterator = dinnerMenu.createIterator();
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();

        printMenu(pancakeIterator);
        System.out.println("\n");
        printMenu(dinnerIterator);
        System.out.println("\n");

    }

    public void printMenu(Iterator iterator) {
        while(iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

}
