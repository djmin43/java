package org.example.collection;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();

        Waitress alice = new Waitress(pancakeHouseMenu, dinnerMenu);

        alice.printMenu();
    }
}
