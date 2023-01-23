package mindongjoon.todolist.repository;

import mindongjoon.todolist.domain.TodoItem;

import java.util.*;

public class MemoryTodoItemRepository implements TodoItemRepository {

    private static Map<Long, TodoItem> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public TodoItem create(TodoItem todoItem) {
        todoItem.setId(++sequence);
        store.put(todoItem.getId(), todoItem);
        return todoItem;
    }

    @Override
    public TodoItem update(Long id, TodoItem todoItem) {
        store.replace(id, store.get(id), todoItem);
        return todoItem;
    }

    @Override
    public List<TodoItem> delete(Long id) {
        store.remove(id);
        return new ArrayList<>(store.values());
    }

    @Override
    public Optional<TodoItem> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public List<TodoItem> sortByIsFinished(Boolean isFinished) {
        return new ArrayList<>((Collection<TodoItem>) store.values().stream().filter(item -> item.getIsFinished().equals(isFinished)));
    }

    @Override
    public List<TodoItem> getAllTodoItems() {
        return new ArrayList<>(store.values());
    }
}
