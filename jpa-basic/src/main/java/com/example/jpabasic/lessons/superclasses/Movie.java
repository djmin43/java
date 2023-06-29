package com.example.jpabasic.lessons.superclasses;

import javax.persistence.Entity;

@Entity
public class Movie extends ProductItem {
    private String director;
    private String actor;
}
