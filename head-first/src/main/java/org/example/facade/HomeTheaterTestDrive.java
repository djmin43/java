package org.example.facade;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();

        homeTheater.watchMovie("indiana jones");
        homeTheater.endMovie();

    }
}
