package com.example.jpabasic.repository;

import com.example.jpabasic.domain.Book;
import com.example.jpabasic.domain.Member;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class JPARepository {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void realExample() {
        Book book = new Book();
        book.setName("JPA");
        book.setAuthor("mindongjoon");

        em.persist(book);

    }
}
