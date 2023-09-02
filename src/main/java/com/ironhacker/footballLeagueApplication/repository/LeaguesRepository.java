package com.ironhacker.footballLeagueApplication.repository;

import com.ironhacker.footballLeagueApplication.model.League;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaguesRepository extends JpaRepository<League,Long> {

}
