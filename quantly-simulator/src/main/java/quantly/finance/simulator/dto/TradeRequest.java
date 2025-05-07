package quantly.finance.simulator.dto;

import lombok.Data;
import quantly.finance.simulator.entity.TradeType;

@Data
public class TradeRequest {
    private Long portfolioId;
    private String stockName;
    private int quantity;
    private double price;
    private TradeType type;
}