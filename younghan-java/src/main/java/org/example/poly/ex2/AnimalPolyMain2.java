package org.example.poly.ex2;

public class AnimalPolyMain2 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cow cow = new Cow();
        Cat cat = new Cat();

        Animal[] animalArr = {dog, cat, cow};

        for (Animal animal : animalArr) {

            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }

    }

}
