package mindongjoon.todolist.repository;

import mindongjoon.todolist.domain.TodoItem;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MemoryTodoItemRepositoryTest {

    MemoryTodoItemRepository repository = new MemoryTodoItemRepository();

    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }

    @Test
    void create() {
        TodoItem result = this.createNewTodoItem("itemA", "this is item A");
        assertThat(result.getName()).isEqualTo("itemA");
    }

    @Test
    void update() {
        TodoItem result = this.createNewTodoItem("itemA", "this is item A");
        result.setName("itemB");
        repository.update(result.getId(), result);
        TodoItem updatedItem = repository.findById(result.getId()).get();
        assertThat(updatedItem.getName()).isEqualTo("itemB");
    }

    @Test
    void delete() {
        TodoItem result = this.createNewTodoItem("itemA", "this will be deleted");
        List<TodoItem> allTodoItems = repository.getAllTodoItems();
        int addedSize = allTodoItems.size();
        assertThat(addedSize).isEqualTo(1);
        repository.delete(result.getId());
        List<TodoItem> newTodoItems = repository.getAllTodoItems();
        assertThat(newTodoItems.size()).isEqualTo(0);
    }

    @Test
    void findById() {

    }

    @Test
    void sortByIsFinished() {
    }

    @Test
    void getAllTodoItems() {
    }

    public TodoItem createNewTodoItem(String name, String description) {
        TodoItem todoItem = new TodoItem();
        todoItem.setName(name);
        todoItem.setDescription(description);
        repository.create(todoItem);
        return repository.findById(todoItem.getId()).get();
    }
}