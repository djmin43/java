package com.example.jpabasic.lessons.superclasses;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Alb")
public class Album extends ProductItem {
    private String artist;
}
