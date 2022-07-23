package com.java.OOPClass;

import java.util.ArrayList;

public class JavaLessonEleven {

    public static void main(String[] args) {
        ArrayList arrayListOne;

        arrayListOne = new ArrayList();

        ArrayList arrayListTwo = new ArrayList();

        ArrayList<String> names = new ArrayList<String>();

        names.add("John Smith");
        names.add("Austin Lee");
        names.add("Derek Banas");

        names.add(2, "Jack Ryan");

        names.set(0, "Kobe Bryant");

        names.remove(3);
        

        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }


    }
}
