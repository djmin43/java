package com.example.jpabasic.lessons.embedded;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class AddressExample {

    private String city;
    private String zipcode;
    private String street;
}
