package com.example.jpabasic;

import com.example.jpabasic.domain.Member;
import com.example.jpabasic.repository.MemberRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DBConnectTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    @Transactional
    @Rollback(value = false)
    public void saveMember() {
        Member member = new Member();
        member.setUserName("helloName");
        Long saveId = memberRepository.save(member);
        System.out.println("saveId = " + saveId);
    }


}
