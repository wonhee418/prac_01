package com.practice.prac_01.controller;

import com.practice.prac_01.dto.MemberRequestDto;
import com.practice.prac_01.dto.MemberResponsDto;
import com.practice.prac_01.model.Member;
import com.practice.prac_01.repository.MemberRepository;
import com.practice.prac_01.service.MemberService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController{

    private final MemberService memberService;
    private final MemberRepository memberRepository;

    //멤버 생성
    @PostMapping("/join")
    public ResponseEntity<MemberResponsDto> memberJoin(@RequestBody MemberRequestDto memberRequestDto) {
        return ResponseEntity.ok().body(memberService.memberJoin(memberRequestDto));
    }

    //멤버 전체 조회
    @GetMapping("/members")
    public ResponseEntity<Result<List<Member>>> allMember() {
        List<Member> members = memberRepository.findAll();
        return ResponseEntity.ok().body( new Result<>(members, members.size()));
    }

    @Getter
    @Setter
    static class Result<T> {
        private T date;
        private int count;

        public Result(T date, int count) {
            this.date = date;
            this.count =count;
        }
    }
}