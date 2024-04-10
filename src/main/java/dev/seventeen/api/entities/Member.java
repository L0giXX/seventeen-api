package dev.seventeen.api.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "members")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter

public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String stage_name;
    private String birth_name;
    private String position;
    private LocalDate date_of_birth;
}

