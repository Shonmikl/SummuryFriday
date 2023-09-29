package org.example._2023_09_29.mockito.mock;

public class SimpleTradingService implements TradingService {

	TradeRepository tradeRepository;
	AuditService auditService;

	public SimpleTradingService(TradeRepository tradeRepository, AuditService auditService) {
		this.tradeRepository = tradeRepository;
		this.auditService = auditService;
	}

	@Override
	public Long createTrade(Trade trade) throws CreateTradeException {
		Long id = tradeRepository.createTrade(trade);
		auditService.logNewTrade(trade);
		return id;
	}
}