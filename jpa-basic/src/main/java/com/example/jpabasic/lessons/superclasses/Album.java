package com.example.jpabasic.lessons.superclasses;

import javax.persistence.Entity;

@Entity
public class Album extends ProductItem {
    private String artist;
}
