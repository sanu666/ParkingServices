package com.Sanu.Cust;



import com.Sanu.Bank.BankAccount;
import com.Sanu.Bank.BankAccountList;
import com.Sanu.Bank.BankAccountListVer_2;
import com.Sanu.Bank.CurrentAccount;
import com.Sanu.Bank.CurrentAccountVer_2;
import com.Sanu.Bank.SavingsAccount;
import com.Sanu.Bank.SavingsAccountVer_2;

public class Customer1 {
	
	public static void main(String[] args) {
		/*BankAccount acc=null;
		acc=new SavingsAccount();
		System.out.println(acc);*/
		
		
		/*SavingsAccountVer_2 savAccount=new SavingsAccountVer_2();
		System.out.println(savAccount);
		
		CurrentAccountVer_2 curAccount=new CurrentAccountVer_2();
		System.out.println(curAccount);*/
		
		
		BankAccountListVer_2.addBankAccount(new BankAccount("Sanu",(double)1000.02));
		BankAccountListVer_2.addBankAccount(new BankAccount("Pandey",(double)2000.02));
		BankAccountListVer_2.addBankAccount(new BankAccount("Pragnya",(double)20000.02));
		BankAccountListVer_2.addBankAccount(new BankAccount("Dhrrubo",(double)5000.02));
		/*for(BankAccount acc:BankAccountListVer_2.getAllBankAccount())
			System.out.println(acc);
	
		for(BankAccount acc:BankAccountListVer_2.removeBankAccount(1))
			System.out.println(acc);
		
		for(BankAccount acc:BankAccountListVer_2.getAllBankAccount())
			System.out.println(acc);
		
		System.out.println(BankAccountListVer_2.getBankAccountByAccountNumber(2));*/
		System.out.println(BankAccountListVer_2.getAllBankAccount());
		System.out.println(BankAccountListVer_2.sortByname());
		//System.out.println(BankAccountList.getAllBankAccount()[0]+"\t"+BankAccountList.getAllBankAccount()[1]);
		/*System.out.println(BankAccountList.getBankAccountByAccountNumber(3));
		System.out.println(BankAccountList.removeBankAccount(3));*/
		
	}

}
