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
import java.util.List;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class TodoItemServiceTest {

    @Autowired
    TodoItemService todoItemService;

    @Test
    public void addTodoItem() {

        TodoItem todoItem = new TodoItem();
        todoItem.setTitle("테스트1");
        todoItem.setDescription("이것은 테스트 todo입니다");
        todoItem.setIsDone(false);
        todoItem.setLocalDateTime(LocalDateTime.now());
        Long todoId = todoItemService.addTodoItem(todoItem);
        assertThat(todoId).isEqualTo(todoItem.getId());
    }

    @Test
    public void findTodoItem() {
        TodoItem todoItem = new TodoItem();
        todoItem.setTitle("테스트1");
        todoItemService.addTodoItem(todoItem);
        TodoItem findItem = todoItemService.findTodoItem(todoItem.getId());
        assertThat(findItem.getTitle()).isEqualTo("테스트1");
    }
    @Test
    public void findAllTodoItem() {
        TodoItem todoItem1 = new TodoItem();
        todoItem1.setTitle("테스트1");
        todoItemService.addTodoItem(todoItem1);
        TodoItem todoItem2 = new TodoItem();
        todoItem2.setTitle("테스트2");
        todoItemService.addTodoItem(todoItem2);
        List<TodoItem> todoItems = todoItemService.findAllTodoItem();
        System.out.println("todoItems = " + todoItems);
        assertThat(todoItems.size()).isEqualTo(2);
    }


}