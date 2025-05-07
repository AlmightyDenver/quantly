package quantly.finance.simulator.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import quantly.finance.simulator.dto.PortfolioRequest;
import quantly.finance.simulator.entity.Portfolio;
import quantly.finance.simulator.repository.PortfolioRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PortfolioService {

    private final PortfolioRepository portfolioRepository;

    public Portfolio createPortfolio(PortfolioRequest request) {
        Portfolio portfolio = Portfolio.builder()
                .name(request.getName())
                .build();
        Portfolio savedPortfolio = portfolioRepository.save(portfolio);
        System.out.println("[DEBUG] 저장된 포트폴리오: id=" + savedPortfolio.getId() + ", name=" + savedPortfolio.getName());
        return savedPortfolio;

    }

    public List<Portfolio> getAllPortfolios() {
        return portfolioRepository.findAll();
    }



}