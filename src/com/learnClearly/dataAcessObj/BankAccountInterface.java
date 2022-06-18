package com.learnClearly.dataAcessObj;

import java.util.List;

import com.learnClearly.dataTranObj.BankAccount;

public interface BankAccountInterface {

	public abstract void addBankAccount(BankAccount bankAccountToAdd);

	public abstract void updateBankAccount(BankAccount bankAccountToUpdate) throws Exception;

	public abstract void removeBankAccount(BankAccount bankAccountToRemove) throws Exception;

	public abstract List<BankAccount> getAllBankAccounts();

}
