package com.mindongjoon.todo.service;

import com.mindongjoon.todo.domain.TodoItem;
import com.mindongjoon.todo.repository.TodoItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TodoItemService {
    private final TodoItemRepository todoItemRepository;

    @Transactional
    public Long addTodoItem(TodoItem todoItem) {
        todoItemRepository.add(todoItem);
        return todoItem.getId();
    }

    @Transactional(readOnly = true)
    public TodoItem findTodoItem(Long id) {
        return todoItemRepository.findOne(id);
    }

}
