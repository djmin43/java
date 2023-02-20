package com.mindongjoon.todo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Entity
@Transactional
@Getter
@Setter
public class TodoItem {
    @Id
    @GeneratedValue
    @Column(name = "todo_item_id")
    private Long id;
    private String title;
    private String description;
    private LocalDateTime localDateTime;
    private Boolean isDone;

}
