package quantly.finance.simulator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import quantly.finance.simulator.entity.Holding;

import java.util.List;

public interface HoldingRepository extends JpaRepository<Holding, Long> {
    List<Holding> findByPortfolioId(Long portfolioId);
}
