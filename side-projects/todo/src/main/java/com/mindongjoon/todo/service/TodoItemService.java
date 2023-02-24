package com.mindongjoon.todo.service;

import com.mindongjoon.todo.domain.TodoItem;
import com.mindongjoon.todo.repository.TodoItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class TodoItemService {
    private final TodoItemRepository todoItemRepository;

    @Transactional
    public Long addTodoItem(TodoItem todoItem) {
        todoItemRepository.add(todoItem);
        return todoItem.getId();
    }
    public TodoItem findTodoItem(Long id) {
        return todoItemRepository.findOne(id);
    }

    public List<TodoItem> findAllTodoItem() {
        return todoItemRepository.findAll();
    }

}
