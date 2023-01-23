package mindongjoon.todolist.repository;

import mindongjoon.todolist.domain.TodoItem;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

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
        TodoItem todoItem = new TodoItem();
        todoItem.setName("itemA");
        todoItem.setDescription("this is item A");
        repository.create(todoItem);
        TodoItem result = repository.findById(todoItem.getId()).get();
        assertThat(result.getName()).isEqualTo("itemA");
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
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
}