package org.example.oop;


abstract class Predator extends Animal {
    abstract String getFood();

    void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }

    static int LEG_COUNT = 4;  // 인터페이스 상수

    static int speed() {
        return LEG_COUNT * 30;
    }

}

interface Barkable {
    void bark();
}

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Predator implements Barkable {
    public String getFood() {
        return "apple";
    }

    public void bark() {
        System.out.println("어흥");
    }
}

class Lion extends Predator implements Barkable {
    public String getFood() {
        return "banana";
    }

    public void bark() {
        System.out.println("으르렁");

    }

}

class ZooKeeper {

    void feed(Predator predator) {
        System.out.println("feed " + predator.getFood());
    }
}

class Bouncer {
    void barkAnimal(Barkable animal) {
        animal.bark();
    }
}
public class Sample {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(lion);
        bouncer.barkAnimal(tiger);

    }
}
