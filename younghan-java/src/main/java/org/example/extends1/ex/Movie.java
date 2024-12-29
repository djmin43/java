package org.example.extends1.ex;

public class Movie extends Item {

    private String director;
    private String actor;

    public Movie(String name, int prince, String director, String actor) {
        super(name, prince);
        this.director = director;
        this.actor = actor;
    }
}
