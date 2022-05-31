package com.practice.prac_01.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Team {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column
    private String teamName;

    @JoinColumn
    @OneToMany(mappedBy = "team")
    private List<Member> members = new ArrayList<>();


    @Builder
    private Team(String teamName) {
        this.teamName = teamName;
    }

}
