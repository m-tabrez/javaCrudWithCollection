package com.learnClearly.main;

import java.util.List;

import com.learnClearly.bankAccServ.BankAccountServiceImpl;
import com.learnClearly.dataTranObj.BankAccount;

public class ClientMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BankAccountServiceImpl canaraBank = new BankAccountServiceImpl();

		canaraBank.addBankAccount(new BankAccount(1, 20000, "Tabrez"));
		canaraBank.addBankAccount(new BankAccount(2, 25000, "Tasmiya"));
		canaraBank.addBankAccount(new BankAccount(3, 10000, "Talib"));
		canaraBank.addBankAccount(new BankAccount(4, 40000, "Shameem"));

		List<BankAccount> canaraBankAccounts = canaraBank.getAllBankAccounts();

		for (BankAccount ba : canaraBankAccounts) {
			System.out.println(ba.getAccountNumber() + " " + ba.getAccountHoldersName() + " " + ba.getAccountBalance());
		}

		System.out.println(" ");

		BankAccount temp = new BankAccount(8, 20000, "Tasmiya");
		canaraBank.updateBankAccount(temp);

		canaraBankAccounts = canaraBank.getAllBankAccounts();

		for (BankAccount ba : canaraBankAccounts) {
			System.out.println(ba.getAccountNumber() + " " + ba.getAccountHoldersName() + " " + ba.getAccountBalance());
		}

		System.out.println(" ");

		BankAccount delAcc = new BankAccount(3, 10000, "Talib");
		canaraBank.removeBankAccount(delAcc);

		canaraBankAccounts = canaraBank.getAllBankAccounts();

		for (BankAccount ba : canaraBankAccounts) {
			System.out.println(ba.getAccountNumber() + " " + ba.getAccountHoldersName() + " " + ba.getAccountBalance());
		}

	}

}
