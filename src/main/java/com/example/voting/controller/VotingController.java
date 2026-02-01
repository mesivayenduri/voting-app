package com.example.voting.controller;

import com.example.voting.model.Candidate;
import com.example.voting.service.VotingService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api")
public class VotingController {

    private final VotingService votingService;

    public VotingController(VotingService votingService) {
        this.votingService = votingService;
    }

    @PostMapping("/candidates")
    public Candidate addCandidate(@RequestParam String name) {
        return votingService.addCandidate(name);
    }

    @PostMapping("/vote/{id}")
    public String vote(@PathVariable Long id) {
        votingService.vote(id);
        return "Vote cast successfully";
    }

    @GetMapping("/results")
    public Collection<Candidate> results() {
        return votingService.getResults();
    }
}