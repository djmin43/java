package mindongjoon.todolist.repository;

import mindongjoon.todolist.domain.TodoItem;

import java.util.List;
import java.util.Optional;

public interface TodoItemRepository {

    TodoItem create(TodoItem todoItem);

    TodoItem update(Long id, TodoItem todoItem);

    List<TodoItem> delete(Long id);

    Optional<TodoItem> findById(Long id);

    List<TodoItem> filterByIsFinished(Boolean isFinished);

    List<TodoItem> getAllTodoItems();
}
