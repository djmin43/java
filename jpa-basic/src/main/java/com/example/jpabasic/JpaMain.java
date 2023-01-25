package com.example.jpabasic;


import com.example.jpabasic.domain.Member;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class JpaMain {

    @PersistenceContext
    private EntityManager em;

    public void someTest() {
        Member member = new Member();
        em.persist(member);
    }


}
