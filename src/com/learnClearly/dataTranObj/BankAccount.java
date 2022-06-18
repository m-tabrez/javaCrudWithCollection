package com.learnClearly.dataTranObj;

import java.util.Objects;

public class BankAccount {
	private int accountNumber;
	private int accountBalance;
	private String accountHoldersName;

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount(int accountNumber, int accountBalance, String accountHoldersName) {
		super();
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.accountHoldersName = accountHoldersName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountHoldersName() {
		return accountHoldersName;
	}

	public void setAccountHoldersName(String accountHoldersName) {
		this.accountHoldersName = accountHoldersName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		BankAccount other = (BankAccount) obj;
		return accountNumber == other.accountNumber;
	}

}
