package com.learnClearly.bankAccServ;

import java.util.List;

import com.learnClearly.dataTranObj.BankAccount;

public interface BankAccountService {

	public abstract void addBankAccount(BankAccount bankAccountToAdd);

	public abstract void updateBankAccount(BankAccount bankAccountToUpdate) throws Exception;

	public abstract void removeBankAccount(BankAccount bankAccountToRemove) throws Exception;

	public abstract List<BankAccount> getAllBankAccounts();
}
