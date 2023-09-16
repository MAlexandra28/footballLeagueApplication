import com.ironhacker.footballLeagueApplication.model.Player;
import com.ironhacker.footballLeagueApplication.repository.TransactionRepository;
import jakarta.transaction.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> getTransactionsByPlayer(Player player) {
        return transactionRepository.findByPlayer(player);
    }
}