package com.practice.prac_01.repository;

import com.practice.prac_01.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
