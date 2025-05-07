package quantly.finance.simulator.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import quantly.finance.simulator.dto.TradeRequest;
import quantly.finance.simulator.entity.TradeHistory;
import quantly.finance.simulator.service.TradeService;

import java.util.List;

@RestController
@RequestMapping("/api/trades")
@RequiredArgsConstructor
public class TradeController {

    private final TradeService tradeService;

    @PostMapping
    public ResponseEntity<TradeHistory> record(@RequestBody TradeRequest request) {
        return ResponseEntity.ok(tradeService.recordTrade(request));
    }

    @GetMapping("/{portfolioId}")
    public ResponseEntity<List<TradeHistory>> getByPortfolio(@PathVariable Long portfolioId) {
        return ResponseEntity.ok(tradeService.getTrades(portfolioId));
    }
}
