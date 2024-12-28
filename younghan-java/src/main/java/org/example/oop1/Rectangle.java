package org.example.oop1;

public class Rectangle {
    int width;
    int height;

    public int calculateArea() {
        return width * height;
    }

    public int calculatePerimeter() {
        return (2 * width) + (2 * height);
    }

    public boolean isSquare() {
        return width == height;
    }
}
