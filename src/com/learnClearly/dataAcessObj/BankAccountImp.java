package com.learnClearly.dataAcessObj;

import java.util.LinkedList;
import java.util.List;

import com.learnClearly.dataTranObj.BankAccount;

public class BankAccountImp implements BankAccountInterface {

	List<BankAccount> allAccounts = new LinkedList<>();

	@Override
	public void addBankAccount(BankAccount bankAccountToAdd) {
		// TODO Auto-generated method stub
		allAccounts.add(bankAccountToAdd);
	}

	@Override
	public void updateBankAccount(BankAccount bankAccountToUpdate) throws Exception {
		// TODO Auto-generated method stub
		if (!allAccounts.contains(bankAccountToUpdate)) {
			throw new Exception("Bank Account Does Not Exist");
		}

		int index = allAccounts.indexOf(bankAccountToUpdate);
		allAccounts.set(index, bankAccountToUpdate);

	}

	@Override
	public void removeBankAccount(BankAccount bankAccountToRemove) throws Exception {
		// TODO Auto-generated method stub
		if (!allAccounts.contains(bankAccountToRemove)) {
			throw new Exception("Account Does not Exist");
		}

		int index = allAccounts.indexOf(bankAccountToRemove);
		allAccounts.remove(index);
	}

	@Override
	public List<BankAccount> getAllBankAccounts() {
		// TODO Auto-generated method stub
		return allAccounts;
	}

}
