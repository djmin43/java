package org.example.oop;

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {  // Animal 클래스를 상속한다.
    void sleep() {
        System.out.println(this.name + " zzz");
    }

}


public class Sample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("poppy");
        dog.sleep();
    }
}
