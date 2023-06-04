package com.mindongjoon.securityendgame.repository;

import com.mindongjoon.securityendgame.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    User findByUsername(String username);
}
