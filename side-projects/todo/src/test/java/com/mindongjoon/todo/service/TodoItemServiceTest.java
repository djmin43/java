package com.mindongjoon.todo.service;

import com.mindongjoon.todo.domain.TodoItem;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class TodoItemServiceTest {

    @Autowired
    TodoItemService todoItemService;

    @Test
    @Rollback(value = false)
    public void addTodoItem() {

        TodoItem todoItem = new TodoItem();
        todoItem.setTitle("테스트1");
        todoItem.setDescription("이것은 테스트 todo입니다");
        todoItem.setIsDone(false);
        todoItem.setLocalDateTime(LocalDateTime.now());
        Long todoId = todoItemService.addTodoItem(todoItem);
        Assertions.assertThat(todoId).isEqualTo(todoItem.getId());

    }
}