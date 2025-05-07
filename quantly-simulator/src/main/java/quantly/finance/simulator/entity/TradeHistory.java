package quantly.finance.simulator.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class TradeHistory {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String stockName;
    private int quantity;
    private double price;

    private LocalDateTime tradedAt;

    @Enumerated(EnumType.STRING)
    private TradeType type;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;

    @PrePersist
    public void prePersist() {
        tradedAt = LocalDateTime.now();
    }
}
