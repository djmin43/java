package org.example.ref;


import org.example.class1.Student;

public class NullMain1 {

    public static void main(String[] args) {
        Student student = null;
        System.out.println("student = " + student);

        student =  new Student();

        System.out.println("student = " + student);
        student = null;

        System.out.println("student = " + student);
    }
}
