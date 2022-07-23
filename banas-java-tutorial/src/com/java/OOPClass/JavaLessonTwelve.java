package com.java.OOPClass;

import java.util.LinkedList;

public class JavaLessonTwelve {
    public static void main(String[] args) {
        LinkedList linkedListOne = new LinkedList();

        LinkedList<String> names = new LinkedList<String>();

        names.add("jay");
        names.add("austin");
        names.addLast("nathan");
        names.addFirst("joshua");
        names.add(0, "noah");
        names.set(2, "paul");
        names.remove(4);
        names.remove("austin");


        for (String name : names) {
            System.out.println(name);
        }
        
    }
}
