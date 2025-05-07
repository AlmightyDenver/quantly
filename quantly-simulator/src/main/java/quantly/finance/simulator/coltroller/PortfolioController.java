package quantly.finance.simulator.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import quantly.finance.simulator.dto.PortfolioRequest;
import quantly.finance.simulator.entity.Portfolio;
import quantly.finance.simulator.service.PortfolioService;

import java.util.List;

@RestController
@RequestMapping("/api/portfolios")
@RequiredArgsConstructor
public class PortfolioController {

    private final PortfolioService portfolioService;

    @PostMapping
    public ResponseEntity<Portfolio> create(@RequestBody PortfolioRequest request) {
        return ResponseEntity.ok(portfolioService.createPortfolio(request));
    }

    @GetMapping
    public ResponseEntity<List<Portfolio>> getAll() {
        return ResponseEntity.ok(portfolioService.getAllPortfolios());
    }
}
