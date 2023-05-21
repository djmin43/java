package com.example.mindongjoon.authdemo.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String userName;
    private String password;
    private String name;


    @OneToMany(mappedBy = "member")
    private List<Todo> todosList = new ArrayList<>();
}
