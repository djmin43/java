package org.example.extends1.ex;

public class Album extends Item {
    public String artist;

    public Album(String name, int prince, String artist) {
        super(name, prince);
        this.artist = artist;
    }
}
