package com.practice.prac_01.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "age", nullable = false)
    private int age;

    @ManyToOne
    @JoinColumn(name = "TEAM_ID") //
    private Team team;

    @Builder
    private Member(String username, Team team) {
        this.username = username;
        this.team = team;
    }
}
