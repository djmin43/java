package com.mindongjoon.securityendgame.controller;

import com.mindongjoon.securityendgame.domain.Member;
import com.mindongjoon.securityendgame.dto.MemberCreationRequestDTO;
import com.mindongjoon.securityendgame.dto.MemberCreationResponseDTO;
import com.mindongjoon.securityendgame.dto.ResultWrapperDTO;
import com.mindongjoon.securityendgame.model.LoginRequest;
import com.mindongjoon.securityendgame.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    @GetMapping("/")
    public String home() {
        return "Home";
    }

    @PostMapping("/user")
    public ResultWrapperDTO<MemberCreationResponseDTO> createUser(@RequestBody MemberCreationRequestDTO memberCreationDTO) {
        // refactor here
        Member newMember = new Member();
        newMember.setUsername(memberCreationDTO.getUsername());
        newMember.setEmail(memberCreationDTO.getEmail());
        newMember.setPassword(passwordEncoder.encode(memberCreationDTO.getPassword()));
        memberRepository.save(newMember);
        MemberCreationResponseDTO memberCreationResponseDTO = new MemberCreationResponseDTO();
        memberCreationResponseDTO.setId(newMember.getId());
        return new ResultWrapperDTO<>(memberCreationResponseDTO);
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest userLogin) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userLogin.username(), userLogin.password()));
        authentication.
        return userLogin.username();
    }


}
