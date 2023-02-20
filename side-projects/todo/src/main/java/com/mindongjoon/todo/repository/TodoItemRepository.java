package com.mindongjoon.todo.repository;

import com.mindongjoon.todo.domain.TodoItem;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class TodoItemRepository {

    private final EntityManager em;

    public void add(TodoItem todoItem) {
        em.persist(todoItem);
    }

    public void deleteOne(Long id) {
        em.createQuery("delete from TodoItem i where i.id = :id")
                .setParameter("id", id)
                .executeUpdate();
    }




}
