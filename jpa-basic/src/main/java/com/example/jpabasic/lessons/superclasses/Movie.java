package com.example.jpabasic.lessons.superclasses;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("movie")
public class Movie extends ProductItem {
    private String director;
    private String actor;
}
