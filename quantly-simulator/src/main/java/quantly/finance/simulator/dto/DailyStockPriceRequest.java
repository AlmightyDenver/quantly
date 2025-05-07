package quantly.finance.simulator.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class DailyStockPriceRequest {
    private String stockName;
    private LocalDate date;
    private double openPrice;
    private double closePrice;
}