package za.co.zailab.services.launch;

import za.co.zailab.services.accounts.SavingsAccount;
import za.co.zailab.services.accounts.exceptions.AccountNotFoundException;
import za.co.zailab.services.accounts.exceptions.WithdrawalAmountTooLargeException;

public class Launch {

	public static void main(String[] args) {

		Launch launch = new Launch();
		launch.start();
	}

	/**
	 * Start program execution
	 */
	private void start() {

		// savings withdraw
		withdraw(new SavingsAccount());

	}

	/**
	 * 
	 * @param savings
	 */
	private static void withdraw(SavingsAccount savings) {

		// Savings
		SavingsAccount savingsAccount = new SavingsAccount();
		try {
			savingsAccount.withdraw(101L, 500);
		} catch (AccountNotFoundException | WithdrawalAmountTooLargeException e) {
			if (e instanceof AccountNotFoundException) {
				try {
					throw new AccountNotFoundException("Account NOT found!");
				} catch (AccountNotFoundException e1) {
					e1.printStackTrace();
				}
			} else {
				try {
					throw new WithdrawalAmountTooLargeException("Withdrawal amount too large!");
				} catch (WithdrawalAmountTooLargeException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
}
