package com.example.jpabasic.dto;

import lombok.Data;

@Data
public class MemberDto {

    public MemberDto(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;
}
