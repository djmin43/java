package com.example.mindongjoon.authdemo.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Todo {

    @Id
    @GeneratedValue
    @Column(name = "todo_id")
    private Long id;

    private String taskName;
    private String description;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;


}
