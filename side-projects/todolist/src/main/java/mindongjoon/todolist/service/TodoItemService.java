package mindongjoon.todolist.service;

import lombok.AllArgsConstructor;
import mindongjoon.todolist.repository.TodoItemRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TodoItemService {

    private final TodoItemRepository todoItemRepository;
}
