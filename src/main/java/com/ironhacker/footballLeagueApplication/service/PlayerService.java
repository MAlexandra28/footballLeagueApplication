package com.ironhacker.footballLeagueApplication.service;

import com.ironhacker.footballLeagueApplication.model.Player;
import com.ironhacker.footballLeagueApplication.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public Player getPlayerByName(String playerName) {
        // Implement the logic to retrieve a player by name from the repository
        // You can use playerRepository.findByName(playerName) or a similar method
        return playerRepository.findByName(playerName);
    }

    public Player create(Player player) {
        return playerRepository.save(player);
    }

    public Player updatePlayer(Player updatedPlayerData) {
        // Step 1: Retrieve the existing player from the database by its ID
        Long playerId = null;
        Player existingPlayer = playerRepository.findById(playerId).orElse(null);

        // Step 2: Check if the player with the given ID exists
        if (existingPlayer == null) {
            return null; // or throw an exception, depending on your error handling strategy
        }

        // Step 3: Update the fields of the existing player with the values provided
        // You can choose which fields to update based on your requirements
        existingPlayer.setName(updatedPlayerData.getName());
        existingPlayer.setWage(updatedPlayerData.getWage());
        // Update other fields as needed

        // Step 4: Save the updated player back to the database
        Player updatedPlayer = playerRepository.save(existingPlayer);

        // Step 5: Return the updated player
        return updatedPlayer;
    }

    public boolean deletePlayer(Long playerId) {
        // Implement the logic to delete a player by ID
        // First, check if the player with the given ID exists
        if (playerRepository.existsById(playerId)) {
            // If the player exists, delete the player from the repository
            playerRepository.deleteById(playerId);
            return true;
        }

        // Return false if the player does not exist
        return false;
    }
}


