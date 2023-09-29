package org.example._2023_09_29.mockito.stub;

import java.util.Collection;

public interface PricingService {

	// [... other methods ...]
	
	Price getHighestPricedTrade(Collection<Trade> trades);
}