package com.practice.prac_01.dto;

import com.practice.prac_01.model.Team;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberRequestDto {
    private String username;
    private Team team;
}
