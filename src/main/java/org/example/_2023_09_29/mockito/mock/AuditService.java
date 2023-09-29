package org.example._2023_09_29.mockito.mock;

public interface AuditService {
	void logNewTrade(Trade trade);
}

class CreateTradeException extends RuntimeException {
	public CreateTradeException() {
		super("Cannot create such trade!");
	}
}

class SimpleAuditService implements AuditService {
	@Override
	public void logNewTrade(Trade trade) {
		throw new RuntimeException("implement logNewTrade() in SimpleAuditService");
	}
}