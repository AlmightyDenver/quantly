package quantly.finance.simulator.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class DailyStockPrice {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String stockName;
    private LocalDate date;
    private double openPrice;
    private double closePrice;
}