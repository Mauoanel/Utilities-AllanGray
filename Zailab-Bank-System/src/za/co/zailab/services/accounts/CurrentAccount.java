/**
 * 
 */
package za.co.zailab.services.accounts;

import za.co.zailab.services.accounts.exceptions.AccountNotFoundException;
import za.co.zailab.services.accounts.exceptions.WithdrawalAmountTooLargeException;
import za.co.zailab.services.accounts.transactions.AccountService;

/**
 * @author Lawrence
 *
 */
public class CurrentAccount implements AccountService {

	private double balance;

	public CurrentAccount() {
		balance = 0;
	}

	public CurrentAccount(double initialBalance, double initialInterest) {
		balance = initialBalance;
	}

	@Override
	public void withdraw(Long accountId, int amountToWithdraw)
			throws AccountNotFoundException, WithdrawalAmountTooLargeException {
		balance = balance - amountToWithdraw;
	}

	@Override
	public void deposit(Long accountId, int amountToDeposit) throws AccountNotFoundException {
		balance = balance + amountToDeposit;
	}

	@Override
	public void openSavingsAccount(Long accountId, Long amountToDeposit) {
		// TODO Auto-generated method stub

	}

	@Override
	public void openCurrentAccount(Long accountId) {
		// TODO Auto-generated method stub

	}

}
