package quantly.finance.simulator.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import quantly.finance.simulator.dto.DailyStockPriceRequest;
import quantly.finance.simulator.entity.DailyStockPrice;
import quantly.finance.simulator.repository.DailyStockPriceRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DailyStockPriceService {

    private final DailyStockPriceRepository dailyStockPriceRepository;

    public DailyStockPrice save(DailyStockPriceRequest request) {
        DailyStockPrice price = DailyStockPrice.builder()
                .stockName(request.getStockName())
                .date(request.getDate())
                .openPrice(request.getOpenPrice())
                .closePrice(request.getClosePrice())
                .build();
        return dailyStockPriceRepository.save(price);
    }

    public List<DailyStockPrice> getByStock(String stockName) {
        return dailyStockPriceRepository.findByStockName(stockName);
    }
}