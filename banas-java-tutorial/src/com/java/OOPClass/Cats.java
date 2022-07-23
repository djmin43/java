package com.java.OOPClass;

public class Cats extends Animals {
    public String favToy = "yarn";
    public void playWith(){
        System.out.println("yeah" + favToy);
    }

    public void walkAround() {
        System.out.println(this.getName() + "stalks around");
    }

    public String getToy() {
        return this.favToy;
    }

    public Cats(){

    }

    public Cats(String name, String favToy){
        super(name, favFood);
        this.favToy = favToy;
    }
}
