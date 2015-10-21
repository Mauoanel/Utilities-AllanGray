/**
 * 
 */
package za.co.zailab.services.accounts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import za.co.zailab.services.accounts.exceptions.AccountNotFoundException;
import za.co.zailab.services.accounts.exceptions.WithdrawalAmountTooLargeException;
import za.co.zailab.services.accounts.rules.SavingsRules;
import za.co.zailab.services.accounts.transactions.AccountService;
import za.co.zailab.services.dataholders.DataHolder;

/**
 * @author Lawrence
 *
 */
public class SavingsAccount implements AccountService {

	private double balance;

	public SavingsAccount() {
		balance = 0;
	}

	public SavingsAccount(double initialBalance, double initialInterest) {
		balance = initialBalance;
	}

	@Override
	public void withdraw(Long accountId, int amountToWithdraw)
			throws AccountNotFoundException, WithdrawalAmountTooLargeException {

		DataHolder dataHolder = new DataHolder();
		Map<Long, Double> existingRecords = new HashMap<>();
		Double currentBalance = 0.0;

		existingRecords = dataHolder.savingsDataHolder();

		Iterator<Map.Entry<Long, Double>> entries = existingRecords.entrySet().iterator();
		AccNoAndBalance: while (entries.hasNext()) {
			Map.Entry<Long, Double> entry = entries.next();
			Long dataHolderAccNo = entry.getKey();
			Double dataHolderAccBal = entry.getValue();

			if ((dataHolderAccNo == accountId) && (SavingsRules.isMinimumAccountEnough((double) dataHolderAccBal))) {
				balance = dataHolderAccBal;
				currentBalance = dataHolderAccBal;
				balance = balance - amountToWithdraw;
				break AccNoAndBalance;
			}
		}

		System.out.println("Saving Account.");
		System.out.println("Current Balance : R" + currentBalance);
		System.out.println("Withdrawn : R" + amountToWithdraw);
		System.out.println("New Balance : R" + balance);
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
