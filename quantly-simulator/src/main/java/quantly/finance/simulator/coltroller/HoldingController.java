package quantly.finance.simulator.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import quantly.finance.simulator.dto.HoldingRequest;
import quantly.finance.simulator.entity.Holding;
import quantly.finance.simulator.service.HoldingService;

import java.util.List;

@RestController
@RequestMapping("/api/holdings")
@RequiredArgsConstructor
public class HoldingController {

    private final HoldingService holdingService;

    @PostMapping
    public ResponseEntity<Holding> add(@RequestBody HoldingRequest request) {
        return ResponseEntity.ok(holdingService.addHolding(request));
    }

    @GetMapping("/{portfolioId}")
    public ResponseEntity<List<Holding>> getByPortfolio(@PathVariable Long portfolioId) {
        return ResponseEntity.ok(holdingService.getHoldingsByPortfolio(portfolioId));
    }
}
