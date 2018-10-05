package com.Sanu.Bank;

import java.util.TreeSet;
import java.util.List;

public class BankAccountListVer_5 {
	
static TreeSet<BankAccount> listOfBankAccount=new TreeSet<BankAccount>();
	
	
	
	public static BankAccount addBankAccount(BankAccount bankAcc)
	{
		
		listOfBankAccount.add(bankAcc);
		return bankAcc;
		
	}
	
	
	public static TreeSet<BankAccount> getAllBankAccount()
	{
		return listOfBankAccount;
	}
	
	
	public static TreeSet<BankAccount> updateBankAccount(int accNo,String accountHolderName)
	{
		for(BankAccount acc:listOfBankAccount)
		{
			if(acc.getAccountNo()==accNo) {
				acc.setAccountHolderName(accountHolderName);
				return listOfBankAccount;
			}
		}
		
		
		throw new RuntimeException("Account Number Non Existing");
		
		
	}
	
	public static TreeSet<BankAccount> removeBankAccount(int accNo)
	{
		
		for(BankAccount acc:listOfBankAccount)
		{
			if(acc.getAccountNo()==accNo) {
				
				listOfBankAccount.remove(acc);
				return listOfBankAccount;
			}
			
		}
		throw new RuntimeException("Account Number Non Existing");
		
	}
	public static BankAccount getBankAccountByAccountNumber(int accountNo)
	{
		
		for(BankAccount acc:listOfBankAccount)
		{
			if(acc.getAccountNo()==accountNo) {
				
				
				return acc;
			}
			
		}
		throw new RuntimeException("Account Number Non Existing");
		
		
		
	}
	
	/*public static List<BankAccount> sortByname() {
	 Collections.sort(listOfBankAccount, new Comparator<BankAccount>()
	{
		 public int compare(BankAccount acc, BankAccount acc2) {
		        return acc.getAccountHolderName().compareTo(acc2.getAccountHolderName());
		    }
		
		
	});
	 listOfBankAccount.sort((BankAccount acc1,BankAccount acc2)->acc1.getAccountHolderName().compareTo(acc2.getAccountHolderName()));
	return listOfBankAccount;
	}
	*/
	
	public static void main(String[] args) {
		BankAccountListVer_5.addBankAccount(new BankAccount("Sanu",(double)1000.02));
		BankAccountListVer_5.addBankAccount(new BankAccount("Pandey",(double)2000.02));
		BankAccountListVer_5.addBankAccount(new BankAccount("Pragnya",(double)20000.02));
		BankAccountListVer_5.addBankAccount(new BankAccount("Dhrrubo",(double)5000.02));
		
		for(BankAccount acc:BankAccountListVer_5.getAllBankAccount())
			System.out.println(acc);
		System.out.println("=====================================================================================");
		/*for(BankAccount acc:BankAccountListVer_5.sortByname())
			System.out.println(acc);*/
	}

}
