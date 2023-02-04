package com.example.jpabasic.repository;

import com.example.jpabasic.domain.Team;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class TeamRepository {

    @PersistenceContext
    EntityManager em;

    public Long save(Team team) {
        em.persist(team);
        return team.getId();
    }

}
