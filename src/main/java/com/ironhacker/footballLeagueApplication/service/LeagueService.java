package com.ironhacker.footballLeagueApplication.service;

import com.ironhacker.footballLeagueApplication.model.League;
import com.ironhacker.footballLeagueApplication.repository.LeaguesRepository;
import org.hibernate.dialect.unique.CreateTableUniqueDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class LeagueService {
    @Autowired
    private LeaguesRepository leagueRepository;
    private Long id;

    public League createLeague(League league) {

            return leagueRepository.save(league);
        }

        public League getLeague(Long id) {

            return leagueRepository.findById(id).orElse(null);
        }

        public void deleteLeague(Long id) {

            leagueRepository.deleteById(id);
        }

    public League updateLeague(Long id, League league) {

        League existingLeague = leagueRepository.findById(id).orElse(null);


        if (existingLeague == null) {
            return null;
        }

        existingLeague.setName(league.getName());

        League updatedLeague = leagueRepository.save(existingLeague);

        return updatedLeague;
    }
}

