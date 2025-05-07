package quantly.finance.simulator.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import quantly.finance.simulator.dto.HoldingRequest;
import quantly.finance.simulator.entity.Holding;
import quantly.finance.simulator.entity.Portfolio;
import quantly.finance.simulator.repository.HoldingRepository;
import quantly.finance.simulator.repository.PortfolioRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HoldingService {

    private final HoldingRepository holdingRepository;
    private final PortfolioRepository portfolioRepository;

    public Holding addHolding(HoldingRequest request) {
        Portfolio portfolio = portfolioRepository.findById(request.getPortfolioId())
                .orElseThrow(() -> {
                    System.out.println("[ERROR] 포트폴리오 ID 없음: " + request.getPortfolioId());
                    return new IllegalArgumentException("포트폴리오를 찾을 수 없습니다.");
                });

        Holding holding = Holding.builder()
                .stockName(request.getStockName())
                .quantity(request.getQuantity())
                .buyPrice(request.getBuyPrice())
                .portfolio(portfolio)
                .build();

        return holdingRepository.save(holding);
    }

    public List<Holding> getHoldingsByPortfolio(Long portfolioId) {
        return holdingRepository.findByPortfolioId(portfolioId);
    }
}
