package com.ironhacker.footballLeagueApplication.repository;

import com.ironhacker.footballLeagueApplication.model.Player;
import jakarta.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByPlayer(Player player);
}
