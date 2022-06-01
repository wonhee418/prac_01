package com.practice.prac_01.controller;

import com.practice.prac_01.dto.MemberRequestDto;
import com.practice.prac_01.dto.MemberResponsDto;
import com.practice.prac_01.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController{

    private final MemberService memberService;

    //멤버 생성
    @PostMapping("/join")
    public HttpEntity<MemberResponsDto> memberJoin(@RequestBody MemberRequestDto memberRequestDto) {
        return ResponseEntity.ok().body(memberService.memberJoin(memberRequestDto));
    }

    //팀 생성
//    @PostMapping("/team")
//    public

}