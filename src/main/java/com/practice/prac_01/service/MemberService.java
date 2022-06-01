package com.practice.prac_01.service;

import com.practice.prac_01.dto.MemberRequestDto;
import com.practice.prac_01.dto.MemberResponsDto;
import com.practice.prac_01.model.Member;

public class MemberService {
    public MemberResponsDto memberJoin(MemberRequestDto memberRequestDto) {
        Member member = Member.builder()
                .username(memberRequestDto.getUsername())
                .build();

        return MemberResponsDto.builder()
                .username(member.getUsername())
                .build();
    }
}
