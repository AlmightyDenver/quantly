package quantly.finance.simulator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import quantly.finance.simulator.entity.TradeHistory;

import java.util.List;

public interface TradeHistoryRepository extends JpaRepository<TradeHistory, Long> {
    List<TradeHistory> findByPortfolioId(Long portfolioId);
}