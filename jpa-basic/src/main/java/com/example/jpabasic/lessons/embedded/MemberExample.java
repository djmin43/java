package com.example.jpabasic.lessons.embedded;

import javax.persistence.*;
import java.time.LocalDateTime;

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

}
