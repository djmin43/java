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

enum DogType {
    DOBERMAN,
    POODLE,

}

class HouseDog extends Dog {

    HouseDog(String name) {
        this.name = name;
    }

    HouseDog(DogType type) {
        if (type == DogType.POODLE) {
            this.name = "poodle";
        } else if (type == DogType.DOBERMAN) {
            this.name = "doberman";
        }
    }

    void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    void sleep(int hour) {
        System.out.println(this.name+" zzz in house for " + hour + " hours");
    }
}



public class Sample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("poppy");
        dog.sleep();
        HouseDog houseDog = new HouseDog("happy");
        houseDog.sleep();
        houseDog.sleep(5);
        HouseDog doberman = new HouseDog(DogType.DOBERMAN);
        doberman.sleep();
    }
}
