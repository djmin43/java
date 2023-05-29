package com.mindongjoon.securityendgame.controller;

import com.mindongjoon.securityendgame.domain.Member;
import com.mindongjoon.securityendgame.dto.MemberCreationDTO;
import com.mindongjoon.securityendgame.repository.MemberRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final MemberRepository memberRepository;

    @GetMapping("/")
    public String home() {
        return "Home";
    }

    @PostMapping("/user")
    public Long createUser(@RequestBody MemberCreationDTO memberCreationDTO) {
        Member newMember = new Member();
        newMember.setUsername(memberCreationDTO.getUsername());
        newMember.setEmail(memberCreationDTO.getEmail());
        newMember.setPassword(memberCreationDTO.getPassword());
        memberRepository.save(newMember);
        return newMember.getId();

    }


}
