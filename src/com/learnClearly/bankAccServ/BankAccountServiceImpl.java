package com.learnClearly.bankAccServ;

import java.util.List;

import com.learnClearly.dataAcessObj.BankAccountImp;
import com.learnClearly.dataTranObj.BankAccount;

public class BankAccountServiceImpl implements BankAccountService {

	BankAccountImp bao = new BankAccountImp();

	@Override
	public void addBankAccount(BankAccount bankAccountToAdd) {
		// TODO Auto-generated method stub
		bao.addBankAccount(bankAccountToAdd);
	}

	@Override
	public void updateBankAccount(BankAccount bankAccountToUpdate) throws Exception {
		// TODO Auto-generated method stub
		bao.updateBankAccount(bankAccountToUpdate);
	}

	@Override
	public void removeBankAccount(BankAccount bankAccountToRemove) throws Exception {
		// TODO Auto-generated method stub
		bao.removeBankAccount(bankAccountToRemove);
	}

	@Override
	public List<BankAccount> getAllBankAccounts() {
		// TODO Auto-generated method stub
		return bao.getAllBankAccounts();
	}

}
