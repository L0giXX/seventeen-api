package dev.seventeen.api.services;

import dev.seventeen.api.entities.MemberFacts;
import dev.seventeen.api.repositories.MemberFactsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberFactsService {
    private final MemberFactsRepository memberFactsRepository;

    public MemberFactsService(MemberFactsRepository memberFactsRepository) {
        this.memberFactsRepository = memberFactsRepository;
    }

    public void addMemberFact(MemberFacts memberFacts) {
        memberFactsRepository.save(memberFacts);
    }

    public void updateMemberFact(MemberFacts memberFacts) {
        memberFactsRepository.save(memberFacts);
    }

    public List<MemberFacts> getMemberFacts() {
        return memberFactsRepository.findAll();
    }

    public MemberFacts getMemberFactById(Long id) {
        return memberFactsRepository.findById(id).orElse(null);
    }

    public void deleteMemberFact(Long id) {
        memberFactsRepository.deleteById(id);
    }
}
