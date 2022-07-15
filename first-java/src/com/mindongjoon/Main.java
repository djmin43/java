package com.mindongjoon;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee jay = new Employee("jay");
        jay.setAge(500);
        jay.setSalary(100);
        jay.setYearsOfExperience(100);
        jay.getSalary();
        jay.doubleSalary();
        jay.getSalary();
        jay.doubleSalary();
        jay.getSalary();
        jay.getYearsOrExperience();
        jay.getAge();
    }
}
