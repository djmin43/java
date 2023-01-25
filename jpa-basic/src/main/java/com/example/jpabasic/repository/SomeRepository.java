package com.example.jpabasic.repository;

import com.example.jpabasic.domain.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class SomeRepository {

    @PersistenceContext
    private EntityManager em;

    public void someTest(Member member) {
        em.persist(member);

    }

}
