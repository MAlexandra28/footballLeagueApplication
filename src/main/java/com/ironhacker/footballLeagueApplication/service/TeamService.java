package com.ironhacker.footballLeagueApplication.service;

import com.ironhacker.footballLeagueApplication.model.Team;
import com.ironhacker.footballLeagueApplication.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

    private final TeamRepository teamRepository;

    @Autowired
    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public Team createTeam(Team team) {

        return teamRepository.save(team);
    }
}