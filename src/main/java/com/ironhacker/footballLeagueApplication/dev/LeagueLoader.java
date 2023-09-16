package com.ironhacker.footballLeagueApplication.dev;

import com.ironhacker.footballLeagueApplication.model.Player;
import com.ironhacker.footballLeagueApplication.service.LeagueService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
@Profile("dev")
public class LeagueLoader implements ApplicationListener<ApplicationReadyEvent> {

    private final LeagueService playerService;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        loadPlayerData();
    }

    private void loadPlayerData() {
        List<PlayerData> playerDataList = Arrays.asList(
                new PlayerData("Kylian Mbappé", 6000000),
                new PlayerData("Neymar", 3675000),
                new PlayerData("Lionel Messi", 3375000),
                new PlayerData("Marquinhos", 1200000),
                new PlayerData("Marco Verratti", 1200000),
                new PlayerData("Hakimi", 1083000),
                new PlayerData("Donnarumma", 916000),
                new PlayerData("Sergio Ramos", 791600),
                new PlayerData("Juan Bernat", 730000),
                new PlayerData("Nordi Mukiele", 700000),
                new PlayerData("Wissam Ben Yedder", 650000),
                new PlayerData("Presnel Kimpembe", 640000),
                new PlayerData("Jordan Veretout", 550000),
                new PlayerData("Fabian Ruiz", 540000),
                new PlayerData("Renato Sanches", 540000)
        );

        for (PlayerData playerData : playerDataList) {
            Player player = new Player(playerData.getName(), (int) playerData.getWage() );
            playerService.buyPlayer(player, null); // Replace null with the actual buying team
        }
    }

    // Define a class to hold player data
    private static class PlayerData {
        private final String name;
        private final double wage;

        public PlayerData(String name, double wage) {
            this.name = name;
            this.wage = wage;
        }

        public String getName() {
            return name;
        }

        public double getWage() {
            return wage;
        }
    }
}