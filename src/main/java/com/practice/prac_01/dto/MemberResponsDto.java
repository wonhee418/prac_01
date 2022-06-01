package com.practice.prac_01.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberResponsDto {
    private String username;
    private int age;
}
