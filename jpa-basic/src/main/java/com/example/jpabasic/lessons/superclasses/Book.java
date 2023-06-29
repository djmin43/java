package com.example.jpabasic.lessons.superclasses;

import javax.persistence.Entity;

@Entity
public class Book extends ProductItem {
    private String author;
    private String isbn;
}
