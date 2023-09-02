package com.ironhacker.footballLeagueApplication.service;

import com.ironhacker.footballLeagueApplication.model.Team;
import com.ironhacker.footballLeagueApplication.repository.TeamRepository;
import org.springframework.stereotype.Service;

@Service
public class TeamService {
    private TeamRepository teamRepository ;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public static void deleteTeam(Long id) {
    }

    public Team createTeam(Team team) {

        return teamRepository.save ( team );
    }
}



