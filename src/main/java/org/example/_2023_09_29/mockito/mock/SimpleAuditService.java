package org.example._2023_09_29.mockito.mock;

public class SimpleAuditService implements AuditService {
	@Override
	public void logNewTrade(Trade trade) {
		throw new RuntimeException("implement logNewTrade() in SimpleAuditService");
	}
}