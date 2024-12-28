package org.example.ref;

import org.example.class1.Student;

public class MethodChange2 {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "hello";

        System.out.println("before : " + student1.name);
        chagneReference(student1);

        System.out.println("after : " + student1.name);

    }

    public static void chagneReference(Student student) {
        student.name = "world";

    }
}
