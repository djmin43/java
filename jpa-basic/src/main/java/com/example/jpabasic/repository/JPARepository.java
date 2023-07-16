package com.example.jpabasic.repository;

import com.example.jpabasic.domain.Book;
import com.example.jpabasic.domain.Member;
import com.example.jpabasic.domain.Order;
import com.example.jpabasic.dto.MemberDto;
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
        member.setName("member");
        member.setAge(10);


        em.persist(member);

        List<Member> resultList = em.createQuery("select m from Member as m order by m.age desc", Member.class)
                .setFirstResult(0)
                .setMaxResults(10)
                .getResultList();
        System.out.println("resultList.size() = " + resultList.size());

    }
}
