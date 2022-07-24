package com.java.OOPClass;

public class JavaLessonFourteen {

    public static void main(String[] args) {
        Animals genericAnimal = new Animals();

        System.out.println(genericAnimal.getName());
        System.out.println(Animals.favFood);

        Cats morris = new Cats("Morris", "Tuna");

        System.out.println(morris.getName());
        System.out.println(morris.favToy);
        System.out.println(morris.favToy);

        Animals tabby = new Cats("Tabby", "Salmon");

        acceptAnimal(tabby);
    }

    public static void acceptAnimal(Animals randAnimal){
        System.out.println(randAnimal.getName());
        System.out.println(randAnimal.favFood);

        Cats tempCat = (Cats) randAnimal;

        System.out.println(tempCat.favToy);
    }




}
