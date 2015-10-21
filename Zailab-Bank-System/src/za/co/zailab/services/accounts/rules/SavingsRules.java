/**
 * 
 */
package za.co.zailab.services.accounts.rules;

/**
 * @author Lawrence
 *
 */
public class SavingsRules {

	/**
	 * Check if the minimum balance is R1000
	 * 
	 * @param amountToWithdraw
	 *            in the account
	 * @return true if the balance is greater or equal to R1000
	 */
	public static boolean isMinimumAccountEnough(double amountToWithdraw) {
		return (amountToWithdraw >= 1000.0 ? true : false);
	}
}
