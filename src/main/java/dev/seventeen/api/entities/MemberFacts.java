package dev.seventeen.api.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "memberfacts")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter

public class MemberFacts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long member_id;
    private String fact;
}
