package com.example.voting.service;

import com.example.voting.model.Candidate;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class VotingService {

    private final Map<Long, Candidate> candidates = new ConcurrentHashMap<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    public Candidate addCandidate(String name) {
        Long id = idGenerator.getAndIncrement();
        Candidate candidate = new Candidate(id, name);
        candidates.put(id, candidate);
        return candidate;
    }

    public void vote(Long candidateId) {
        Candidate candidate = candidates.get(candidateId);
        if (candidate == null) {
            throw new RuntimeException("Candidate not found");
        }
        candidate.incrementVote();
    }

    public Collection<Candidate> getResults() {
        return candidates.values();
    }
}