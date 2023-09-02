package com.ironhacker.footballLeagueApplication.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;



@Getter
@Component
@Setter
@AllArgsConstructor
@SpringBootApplication
@ComponentScan(basePackages = "com.ironhacker.footballLeagueApplication")
public class PlayerData {
    @Autowired
    private String name;
    private int wage;

}