package com.example.jpabasic.lessons.superclasses;

import javax.persistence.Entity;

@Entity
public class Magazine extends ProductItem {
    private String author;
    private String isbn;
}
