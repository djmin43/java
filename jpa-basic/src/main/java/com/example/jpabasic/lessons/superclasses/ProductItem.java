package com.example.jpabasic.lessons.superclasses;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class ProductItem {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int price;
}
