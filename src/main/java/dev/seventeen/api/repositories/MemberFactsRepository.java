package dev.seventeen.api.repositories;

import dev.seventeen.api.entities.MemberFacts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberFactsRepository extends JpaRepository<MemberFacts, Long> {
}
