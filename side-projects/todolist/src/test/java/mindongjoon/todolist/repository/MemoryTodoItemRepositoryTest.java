package mindongjoon.todolist.repository;

import mindongjoon.todolist.domain.TodoItem;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
        TodoItem result = this.createNewTodoItem("itemC", "this will be found");
        Long id = result.getId();
        Optional<TodoItem> itemFoundById = repository.findById(id);
        assertThat(itemFoundById.get()).isSameAs(result);
    }

    @Test
    void filterByIsFinished() {
        this.createNewTodoItem("itemA", "the status will be false");
        this.createNewTodoItem("itemB", "the status will be false");
        TodoItem resultC = this.createNewTodoItem("itemC", "the status will be true");
        resultC.setIsFinished(true);
        List<TodoItem> trueItems = repository.filterByIsFinished(true);
        assertThat(trueItems.size()).isEqualTo(1);
        assertThat(trueItems.stream().filter(item -> item.getIsFinished().equals(false)).collect(Collectors.toList()).size()).isEqualTo(0);

    }

    @Test
    void getAllTodoItems() {
        this.createNewTodoItem("item1", "1");
        this.createNewTodoItem("item2", "2");
        this.createNewTodoItem("item3", "3");
        this.createNewTodoItem("item4", "4");
        this.createNewTodoItem("item5", "5");
        this.createNewTodoItem("item6", "6");
        this.createNewTodoItem("item7", "7");
        assertThat(repository.getAllTodoItems().size()).isEqualTo(7);

    }

    public TodoItem createNewTodoItem(String name, String description) {
        TodoItem todoItem = new TodoItem();
        todoItem.setName(name);
        todoItem.setDescription(description);
        repository.create(todoItem);
        return repository.findById(todoItem.getId()).get();
    }
}