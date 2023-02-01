package com.example.jpabasic.repository;

import com.example.jpabasic.domain.Member;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member member) {

    }

    public Member find(Long id) {
        return em.find(Member.class, id);
    }
}
