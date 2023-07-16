package com.example.jpabasic.repository;

import com.example.jpabasic.domain.Book;
import com.example.jpabasic.domain.Member;
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
        member.setName("member1");
        member.setAge(10);
        em.persist(member);

        List resultList = em.createQuery("select new jpql.MemberDto(m.name, m.age) from Member as m", MemberDto.class)
                .getResultList();

    }
}
