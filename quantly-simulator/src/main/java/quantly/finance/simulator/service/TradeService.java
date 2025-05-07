package quantly.finance.simulator.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import quantly.finance.simulator.dto.TradeRequest;
import quantly.finance.simulator.entity.*;
import quantly.finance.simulator.repository.*;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TradeService {

    private final TradeHistoryRepository tradeHistoryRepository;
    private final PortfolioRepository portfolioRepository;

    public TradeHistory recordTrade(TradeRequest request) {
        Portfolio portfolio = portfolioRepository.findById(request.getPortfolioId())
                .orElseThrow(() -> new IllegalArgumentException("포트폴리오를 찾을 수 없습니다."));

        TradeHistory history = TradeHistory.builder()
                .stockName(request.getStockName())
                .quantity(request.getQuantity())
                .price(request.getPrice())
                .type(request.getType())
                .portfolio(portfolio)
                .build();
        System.out.println("[DEBUG] 거래 기록 요청: portfolioId=" + request.getPortfolioId());
        return tradeHistoryRepository.save(history);
    }

    public List<TradeHistory> getTrades(Long portfolioId) {
        return tradeHistoryRepository.findByPortfolioId(portfolioId);
    }
}