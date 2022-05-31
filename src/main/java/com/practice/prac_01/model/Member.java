package com.practice.prac_01.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(name = "username")
    private String username;

    @ManyToOne
    @JoinColumn(name = "TEAM_ID") //
    private Team team;

    @Builder
    private Member(String username, Team team) {
        this.username = username;
        this.team = team;
    }
}
