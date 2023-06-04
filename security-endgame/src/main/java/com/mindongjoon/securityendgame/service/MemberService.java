package com.mindongjoon.securityendgame.service;

import com.mindongjoon.securityendgame.domain.Member;
import com.mindongjoon.securityendgame.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService implements UserDetailsService {

    private final MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = memberRepository.findByUsername(username);
        System.out.println("user = " + user.getUsername());
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return user;
    }
}
