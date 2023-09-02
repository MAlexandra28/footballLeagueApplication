package com.ironhacker.footballLeagueApplication.controller;

import com.ironhacker.footballLeagueApplication.model.Player;
import com.ironhacker.footballLeagueApplication.service.PlayerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    // TODO: GET ALL PLAYERS

        @PostMapping
        public ResponseEntity<Player> createPlayer(@RequestBody Player player) {
            Player createdPlayer = playerService.create ( player );
            return ResponseEntity.status( HttpStatus.CREATED).body(createdPlayer);
        }



    // TODO: GET PLAYER BY NAME
    @GetMapping("/search")
    public ResponseEntity<Player> getPlayerByName(@RequestParam("name") String playerName) {
        Player player = playerService.getPlayerByName(playerName);
        if (player != null) {
            return ResponseEntity.ok(player);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    // TODO: UPDATE PLAYER
    @PutMapping("/{id}")
    public ResponseEntity<Player> updatePlayer(@PathVariable Long id, @RequestBody @Valid Player player) {
        Player updatedPlayer = playerService.updatePlayer( new Player () );
        if (updatedPlayer != null) {
            return ResponseEntity.ok(updatedPlayer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // TODO: DELETE PLAYER
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlayer(@PathVariable Long id) {
        boolean playerDeleted = playerService.deletePlayer(id);
        if (playerDeleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}


