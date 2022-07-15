package com.mindongjoon;

public class Employee {

    private String name;
    private int age;
    private int salary;
    private int yearsOfExperience;

    public Employee(String name) {
        this.name = name;
    }

    public void getAge() {
        System.out.println(age);
    }

    public void getSalary() {
        System.out.println(salary);
    }

    public void getYearsOrExperience() {
        System.out.println(yearsOfExperience);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setYearsOfExperience(int years) {
        this.yearsOfExperience = years;
    }

    public void doubleSalary() {
        this.salary = this.salary * 2;
    }

}
