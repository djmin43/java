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

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String userName;
    private String password;
    private String name;


    @OneToMany(mappedBy = "member")
    private List<Todo> todosList = new ArrayList<>();

    // static은 공유할때 사용을 많이 한다.
    // public static method같은 경우는 util 함수로 만들때 사용한다.
    public static Member createMember(String userName, String password, String name) {
        Member member = new Member();
        member.setName(name);
        member.setUserName(userName);
        member.setPassword(password);
        return member;
    }

}