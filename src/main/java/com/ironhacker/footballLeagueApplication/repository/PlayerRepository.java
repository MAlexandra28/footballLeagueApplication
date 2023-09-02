package com.ironhacker.footballLeagueApplication.repository;

import com.ironhacker.footballLeagueApplication.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    Player findByName(String playerName);
}
