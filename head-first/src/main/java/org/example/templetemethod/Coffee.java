package org.example.templetemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage {

    public void brew() {
        brewCoffeeGrinds();
    }

    public void addCondiments() {
        addSugarAndMilk();
    }

    public boolean customerWantsCondiments() {
        String answer = getUSerInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUSerInput() {
        String answer = null;

        System.out.println("do you want to add milk and sugar? (y/n)?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.err.println("IO Error");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }


    private void brewCoffeeGrinds() {
        System.out.println("brew coffee grinds");
    }


    private void addSugarAndMilk() {
        System.out.println("add sugar and milk");
    }
}
