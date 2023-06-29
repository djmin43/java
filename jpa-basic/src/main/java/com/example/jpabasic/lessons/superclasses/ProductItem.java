package com.example.jpabasic.lessons.superclasses;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn
public class ProductItem extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int price;
}
