package com.ironhacker.footballLeagueApplication.service;

import com.ironhacker.footballLeagueApplication.model.League;
import com.ironhacker.footballLeagueApplication.model.Player;
import com.ironhacker.footballLeagueApplication.model.Team;
import com.ironhacker.footballLeagueApplication.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeagueService {
    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Player getPlayerById(Long playerId) {
        return playerRepository.findById(playerId).orElse(null);
    }

    public Player buyPlayer(Player player, Team buyerTeam) {

        return playerRepository.save(player);
    }

    public Player sellPlayer(Long playerId, Team sellerTeam) {

        Player player = getPlayerById(playerId);
        if (player != null) {

            player.setTeam(sellerTeam);
            return playerRepository.save(player);
        }
        return null;
    }

    public Player updatePlayerInformation(Player player) {

        return playerRepository.save(player);
    }

    public Player updatePlayer(Player player) {
        return null;
    }

    public boolean deletePlayer(Long id) {
        return Boolean.parseBoolean ( null );
    }

    public Player create(Player player) {
        return null;
    }

    public League createLeague(League league) {
        League o = null;
        return o;
    }

    public League getLeague(Long id) {
        return null;
    }

    public League updateLeague(Long id, League league) {
        return null;
    }

    public void deleteLeague(Long id) {
    }
}