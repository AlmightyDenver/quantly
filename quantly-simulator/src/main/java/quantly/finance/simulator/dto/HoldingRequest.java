package quantly.finance.simulator.dto;

import lombok.Data;

@Data
public class HoldingRequest {
    private Long portfolioId;
    private String stockName;
    private int quantity;
    private double buyPrice;
}
