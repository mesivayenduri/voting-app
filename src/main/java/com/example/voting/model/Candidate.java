package com.example.voting.model;

public class Candidate {

    private Long id;
    private String name;
    private int votes;

    public Candidate(Long id, String name) {
        this.id = id;
        this.name = name;
        this.votes = 0;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getVotes() {
        return votes;
    }

    public void incrementVote() {
        this.votes++;
    }
}