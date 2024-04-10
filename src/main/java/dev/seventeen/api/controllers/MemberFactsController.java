package dev.seventeen.api.controllers;

import dev.seventeen.api.entities.MemberFacts;
import dev.seventeen.api.services.MemberFactsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/member-facts")
public class MemberFactsController {
    private final MemberFactsService memberFactsService;

    @Autowired
    public MemberFactsController(MemberFactsService memberFactsService) {
        this.memberFactsService = memberFactsService;
    }

    @PostMapping
    public ResponseEntity<MemberFacts> addNewFact(@RequestBody MemberFacts memberFacts) {
        memberFactsService.addMemberFact(memberFacts);
        return ResponseEntity.ok(memberFacts);
    }

    @PutMapping
    public ResponseEntity<MemberFacts> updateFact(@RequestBody MemberFacts memberFacts) {
        memberFactsService.updateMemberFact(memberFacts);
        return ResponseEntity.ok(memberFacts);
    }

    @GetMapping
    public ResponseEntity<List<MemberFacts>> getFacts() {
        return ResponseEntity.ok(memberFactsService.getMemberFacts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MemberFacts> getFactById(@PathVariable Long id) {
        return ResponseEntity.ok(memberFactsService.getMemberFactById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteFact(@PathVariable Long id) {
        memberFactsService.deleteMemberFact(id);
        return ResponseEntity.noContent().build();
    }
}
