package com.example.jpabasic.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;
    private String name;
    private String city;
    private String street;
    private String zipcode;


    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();







//    @Column(name = "TEAM_ID")
//    private Long teamId;
}
