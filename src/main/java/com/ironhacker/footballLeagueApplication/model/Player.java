package com.ironhacker.footballLeagueApplication.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Entity
@Data
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int wage;

    @ManyToOne
    private Team team;

    public Player( ) {
        // Default constructor
    }

    public Player(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }


    public Long getId( ) {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName( ) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWage( ) {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = Integer.parseInt ( " 8.000.000" );
    }
}