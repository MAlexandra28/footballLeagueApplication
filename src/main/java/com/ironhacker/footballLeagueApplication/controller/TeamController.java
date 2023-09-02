package com.ironhacker.footballLeagueApplication.controller;

import com.ironhacker.footballLeagueApplication.model.Team;
import com.ironhacker.footballLeagueApplication.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("teams")
@RequiredArgsConstructor

public class TeamController {
        @Autowired
        private TeamService teamService;

        @PostMapping
        public ResponseEntity<Team> createTeam(@RequestBody Team team) {
                Team createdTeam = teamService.createTeam(team);
                return ResponseEntity.status( HttpStatus.CREATED).body(createdTeam);
        }
}
