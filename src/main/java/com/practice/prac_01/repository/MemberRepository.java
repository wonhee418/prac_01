package com.practice.prac_01.repository;

import com.practice.prac_01.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
