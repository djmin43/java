package com.example.jpabasic.repository;

import com.example.jpabasic.domain.Member;
import com.example.jpabasic.domain.Team;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member member) {
        em.persist(member);
        Member findMember = em.find(Member.class, member.getId());

        Team team = findMember.getTeam();
        System.out.println("new member's team name = " + team.getName());

        return member.getId();

    }

    public Member find(Long id) {
        return em.find(Member.class, id);
    }
}
