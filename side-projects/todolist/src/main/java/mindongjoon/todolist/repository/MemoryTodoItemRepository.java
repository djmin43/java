package mindongjoon.todolist.repository;

import mindongjoon.todolist.domain.TodoItem;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;

@Component
public class MemoryTodoItemRepository implements TodoItemRepository {

    private static Map<Long, TodoItem> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public TodoItem create(TodoItem todoItem) {
        todoItem.setId(++sequence);
        System.out.println("todoItem = " + todoItem.getId());
        System.out.println(sequence);
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
    public List<TodoItem> filterByIsFinished(Boolean isFinished) {
        return new ArrayList<>(store.values().stream().filter(item -> item.getIsFinished().equals(isFinished)).toList());
    }

    @Override
    public List<TodoItem> getAllTodoItems() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }
}
