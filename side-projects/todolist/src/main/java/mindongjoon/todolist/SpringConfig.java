package mindongjoon.todolist;

import mindongjoon.todolist.repository.MemoryTodoItemRepository;
import mindongjoon.todolist.repository.TodoItemRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {




    @Bean
    public TodoItemRepository todoItemRepository() {
        return new MemoryTodoItemRepository();
    }

}
