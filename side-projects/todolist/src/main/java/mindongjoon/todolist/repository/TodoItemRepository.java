package mindongjoon.todolist.repository;

import mindongjoon.todolist.domain.TodoItem;

import java.util.List;
import java.util.Optional;

public interface TodoItemRepository {

    TodoItem create(TodoItem todoItem);

    TodoItem update(TodoItem todoItem);

    TodoItem delete(TodoItem todoItem);

    Optional<TodoItem> findById(Long id);

    List<TodoItem> sortByIsFinished(Boolean isFinished);

    List<TodoItem> getAllTodoItems();
}
