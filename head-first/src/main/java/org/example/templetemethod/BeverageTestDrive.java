package org.example.templetemethod;

public class BeverageTestDrive {

    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("\n getting ready for some tea");
        tea.prepareRecipe();

        System.out.println("\n getting ready for some coffee");
        coffee.prepareRecipe();
    }
}
