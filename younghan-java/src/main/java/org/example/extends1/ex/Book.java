package org.example.extends1.ex;

public class Book extends Item {
    private String author;
    private String isbn;

    public Book(String name, int prince, String author, String isbn) {
        super(name, prince);
        this.author = author;
        this.isbn = isbn;
    }
}
