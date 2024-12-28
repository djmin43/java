package org.example.oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        // player on
        isOn = true;
        System.out.println("player starts");

        // volume increase
        volume++;
        System.out.println(volume);
        // volume increase
        volume++;
        System.out.println(volume);
        // volume decrease
        volume--;
        System.out.println(volume);

        // player status
        if (isOn) {
            System.out.println("player is on");
         } else {
            System.out.println("palyer off");
        }
        isOn = false;
        System.out.println("player done3");

        // player off

    }
}
