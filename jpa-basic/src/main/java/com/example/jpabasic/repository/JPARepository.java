package com.example.jpabasic.repository;

import com.example.jpabasic.domain.Book;
import com.example.jpabasic.domain.Member;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class JPARepository {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void realExample() {

        Member member = new Member();
        member.setName("member1");
        member.setAge(10);
        em.persist(member);

        List<Member> resultList = em.createQuery("select m from Member as m where m.name = :username", Member.class)
                .setParameter("username", "member1")
                .getResultList();

        for (Member member1 : resultList) {
            System.out.println("member1 = " + member1.getName());
        }


    }
}
