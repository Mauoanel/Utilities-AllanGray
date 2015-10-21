/**
 * 
 */
package za.co.zailab.services.accounts.transactions;

import java.util.Map;

/**
 * @author Lawrence
 *
 */
public interface DataHolderService {

	/**
	 * Holds the account number and the balance
	 * 
	 * @return a map with account numbers and balances
	 */
	Map<Long, Double> savingsDataHolder();

	/**
	 * Holds the account number and the balance
	 * 
	 * @return a map with account numbers and balances
	 */
	Map<Long, Double> currentDataHolder();
}
