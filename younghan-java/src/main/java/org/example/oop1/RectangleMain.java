package org.example.oop1;

public class RectangleMain {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.height = 10;
        rectangle.width = 10;
        int area = rectangle.calculateArea();
        int per = rectangle.calculatePerimeter();
        boolean isSquare = rectangle.isSquare();
        System.out.println("area = " + area);
        System.out.println("per = " + per);
        System.out.println("isSquare = " + isSquare);


    }
}
