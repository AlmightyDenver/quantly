package quantly.finance.simulator.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import quantly.finance.simulator.dto.DailyStockPriceRequest;
import quantly.finance.simulator.entity.DailyStockPrice;
import quantly.finance.simulator.service.DailyStockPriceService;

import java.util.List;

@RestController
@RequestMapping("/api/prices")
@RequiredArgsConstructor
public class DailyStockPriceController {

    private final DailyStockPriceService dailyStockPriceService;

    @PostMapping
    public ResponseEntity<DailyStockPrice> save(@RequestBody DailyStockPriceRequest request) {
        return ResponseEntity.ok(dailyStockPriceService.save(request));
    }

    @GetMapping("/{stockName}")
    public ResponseEntity<List<DailyStockPrice>> getByStock(@PathVariable String stockName) {
        return ResponseEntity.ok(dailyStockPriceService.getByStock(stockName));
    }
}
