package com.example.jpabasic.lessons.embedded;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class MemberExample {

    @Id
    @GeneratedValue
    @Column(name = "MEMBER_EXAMPLE_ID")
    private Long id;

    @Column(name = "EXAMPLEMEMBER")
    private String username;

    //PeriodExample
    @Embedded
    private PeriodExample workPeriod;

    //AddressExample
    @Embedded
    private AddressExample homeAddress;

    @ElementCollection
    @CollectionTable(name = "FAVORITE_FOODS", joinColumns =
    @JoinColumn(name = "MEMBER_ID")
    )
    @Column(name = "FOOD_NAME")
    private Set<String> favoriteFoods = new HashSet<>();

    @ElementCollection
    @CollectionTable(name = "ADDRESS", joinColumns =
            @JoinColumn(name = "MEMBER_ID")
    )
    private List<AddressExample> addressHistory = new ArrayList<>();

}
