package com.example.jpabasic;

import com.example.jpabasic.domain.Member;
import com.example.jpabasic.domain.Team;
import com.example.jpabasic.repository.MemberRepository;
import com.example.jpabasic.repository.TeamRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@RunWith(SpringRunner.class)
public class JPABasicTest {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    TeamRepository teamRepository;

    @Test
    @Transactional
    @Rollback(value = false)
    public void saveMember() {
        Team team = new Team();
        team.setName("teamA");
        teamRepository.save(team);
        Member member = new Member();
        member.setTeam(team);
        member.setUserName("userA");
        memberRepository.save(member);

    }

    @Test
    @Transactional
    @Rollback(value = false)
    public void saveTeam() {
        Team team = new Team();
        team.setName("teamA");
        Long teamId = teamRepository.save(team);
    }


}
