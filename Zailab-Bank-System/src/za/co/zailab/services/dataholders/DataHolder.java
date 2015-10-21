/**
 * 
 */
package za.co.zailab.services.dataholders;

import java.util.HashMap;
import java.util.Map;

import za.co.zailab.services.accounts.transactions.DataHolderService;

/**
 * @author Lawrence
 *
 */
public class DataHolder implements DataHolderService {

	@Override
	public Map<Long, Double> savingsDataHolder() {

		Map<Long, Double> savings = new HashMap<>();

		savings.put(101L, 3000.0);
		savings.put(102L, 4000.0);
		savings.put(103L, 5422.0);
		savings.put(104L, 2144.0);
		savings.put(105L, 6000.0);

		return savings;
	}

	@Override
	public Map<Long, Double> currentDataHolder() {

		Map<Long, Double> current = new HashMap<>();

		current.put(201L, 6000.0);
		current.put(203L, 10000.0);
		current.put(204L, 6080.0);
		current.put(205L, 5000.0);
		current.put(206L, 11000.0);

		return current;
	}

}
