package mindongjoon.todolist.repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import mindongjoon.todolist.domain.TodoItem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Getter
@Setter
@AllArgsConstructor
public class MemoryTodoItemRepository implements TodoItemRepository {


    private static Map<Long, TodoItem> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public TodoItem create(TodoItem todoItem) {
        return null;
    }

    @Override
    public TodoItem update(TodoItem todoItem) {
        return null;
    }

    @Override
    public TodoItem delete(TodoItem todoItem) {
        return null;
    }

    @Override
    public Optional<TodoItem> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<TodoItem> sortByIsFinished(Boolean isFinished) {
        return null;
    }

    @Override
    public List<TodoItem> getAllTodoItems() {
        return null;
    }
}
