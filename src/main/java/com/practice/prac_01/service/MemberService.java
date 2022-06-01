package com.practice.prac_01.service;

import com.azul.crs.client.Result;
import com.practice.prac_01.dto.MemberRequestDto;
import com.practice.prac_01.dto.MemberResponsDto;
import com.practice.prac_01.model.Member;
import com.practice.prac_01.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberResponsDto memberJoin(MemberRequestDto memberRequestDto) {
        Member member = Member.builder()
                .username(memberRequestDto.getUsername())
                .build();

        memberRepository.save(member);

        return MemberResponsDto.builder()
                .username(member.getUsername())
                .build();
    }

}
