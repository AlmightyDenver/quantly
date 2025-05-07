package quantly.finance.simulator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import quantly.finance.simulator.entity.DailyStockPrice;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface DailyStockPriceRepository extends JpaRepository<DailyStockPrice, Long> {
    Optional<DailyStockPrice> findByStockNameAndDate(String stockName, LocalDate date);
    List<DailyStockPrice> findByStockName(String stockName);
}