/**
 * 
 */
package za.co.zailab.services.accounts.exceptions;

/**
 * @author Lawrence
 *
 */
public class WithdrawalAmountTooLargeException extends Exception {

	/**
	 * Generated serialVersionUID
	 */
	private static final long serialVersionUID = 1058352995371279053L;

	/**
	 * Exception stack will be shown.
	 */
	public WithdrawalAmountTooLargeException() {
		super();
	}

	/**
	 * Message to the shown to the user if the account is not found.
	 * 
	 * @param message
	 */
	public WithdrawalAmountTooLargeException(String message) {
		super(message);
	}
}
