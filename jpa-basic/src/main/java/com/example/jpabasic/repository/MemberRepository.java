package com.example.jpabasic.repository;

import com.example.jpabasic.domain.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member member) {
        em.persist(member);
        return member.getId();

    }

    public Member find(Long id) {
        return em.find(Member.class, id);
    }
}
