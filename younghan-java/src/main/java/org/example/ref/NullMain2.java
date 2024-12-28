package org.example.ref;

import org.example.class1.Student;

public class NullMain2 {

    public static void main(String[] args) {
        Student student = null;
        student.name = "hello";
        System.out.println("student = " + student.name);


    }
}
