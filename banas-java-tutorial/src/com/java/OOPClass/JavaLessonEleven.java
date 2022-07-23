package com.java.OOPClass;

import java.util.ArrayList;
import java.util.Iterator;

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

        System.out.println(names);

        Iterator individualItems = names.iterator();

        while (individualItems.hasNext()) {
            System.out.println(individualItems.next());
        }

        ArrayList nameCopy = new ArrayList();
        ArrayList nameBackup = new ArrayList();

        nameCopy.addAll(names);
        String paulYoung = "Paul Young";
        names.add(paulYoung);

        if (names.contains(paulYoung)) {
            System.out.println("Paul is here");
        }

        if (names.containsAll(nameCopy)) {
            System.out.println("everything in nameCopy is in names");
        }


    }
}
