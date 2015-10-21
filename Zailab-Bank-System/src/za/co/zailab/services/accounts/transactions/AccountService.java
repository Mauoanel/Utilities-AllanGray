/**
 * 
 */
package za.co.zailab.services.accounts.transactions;

import za.co.zailab.services.accounts.exceptions.AccountNotFoundException;
import za.co.zailab.services.accounts.exceptions.WithdrawalAmountTooLargeException;

/**
 * @author Lawrence
 *
 */
public interface AccountService {

	/**
	 * Withdraw an amount from an Account
	 * 
	 * @param accountId
	 *            - accountNumber
	 * @param amountToWithdraw
	 *            amount to be withdrawn
	 * @throws AccountNotFoundException
	 *             thrown exception if the account is not found
	 * @throws WithdrawalAmountTooLargeException
	 *             thrown exception if the withdrawal amount is too large.
	 */
	public void withdraw(Long accountId, int amountToWithdraw)
			throws AccountNotFoundException, WithdrawalAmountTooLargeException;

	/**
	 * Deposit an amount into an account if an account exists.
	 * 
	 * @param accountId
	 *            account number to be deposited to.
	 * @param amountToDeposit
	 *            amount to be deposited.
	 * @throws AccountNotFoundException
	 *             thrown if the account is not found.
	 */
	public void deposit(Long accountId, int amountToDeposit) throws AccountNotFoundException;

	/**
	 * Opens a new savings account
	 * 
	 * @param accountId
	 *            account number to be given on a successful opening of the
	 *            account.
	 * @param amountToDeposit
	 *            the amount to be deposited once the account is opened.
	 */
	public void openSavingsAccount(Long accountId, Long amountToDeposit);

	/**
	 * 
	 * @param accountId
	 */
	public void openCurrentAccount(Long accountId);
}
