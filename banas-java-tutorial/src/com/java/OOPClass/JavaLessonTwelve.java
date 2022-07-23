package com.java.OOPClass;

import java.util.LinkedList;

public class JavaLessonTwelve {
    public static void main(String[] args) {
        LinkedList linkedListOne = new LinkedList();

        LinkedList<String> names = new LinkedList<String>();

        names.add("jay");
        names.add("austin");

        for (String name: names){
            System.out.println(name);
        }
    }
}
