package quantly.finance.simulator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import quantly.finance.simulator.entity.Portfolio;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
}