package com.example.jpabasic.lessons.embedded;

import lombok.Data;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
@Data
public class AddressExample {

    private String city;
    private String zipcode;
    private String street;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressExample that = (AddressExample) o;
        return Objects.equals(city, that.city) && Objects.equals(zipcode, that.zipcode) && Objects.equals(street, that.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, zipcode, street);
    }
}
