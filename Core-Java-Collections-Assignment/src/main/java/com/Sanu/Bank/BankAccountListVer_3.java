package com.Sanu.Bank;

import java.util.LinkedList;
import java.util.List;

public class BankAccountListVer_3 {
	
static LinkedList<BankAccount> listOfBankAccount=new LinkedList<BankAccount>();
	
	
	
	public static BankAccount addBankAccount(BankAccount bankAcc)
	{
		
		listOfBankAccount.add(bankAcc);
		return bankAcc;
		
	}
	
	
	public static LinkedList<BankAccount> getAllBankAccount()
	{
		return listOfBankAccount;
	}
	
	
	public static LinkedList<BankAccount> updateBankAccount(int accNo,String accountHolderName)
	{
		for(int internalIndex=0;internalIndex<listOfBankAccount.size();internalIndex++)
		{
			if(listOfBankAccount.get(internalIndex).getAccountNo()==accNo) {
				listOfBankAccount.get(internalIndex).setAccountHolderName(accountHolderName);
				return listOfBankAccount;
			}
		}
		
		
		throw new RuntimeException("Account Number Non Existing");
		
		
	}
	
	public static LinkedList<BankAccount> removeBankAccount(int accNo)
	{
		
		for(int internalIndex=0;internalIndex<listOfBankAccount.size();internalIndex++)
		{
			if(listOfBankAccount.get(internalIndex).getAccountNo()==accNo) {
				
				listOfBankAccount.remove(listOfBankAccount.get(internalIndex));
				return listOfBankAccount;
			}
			
		}
		throw new RuntimeException("Account Number Non Existing");
		
	}
	public static BankAccount getBankAccountByAccountNumber(int accountNo)
	{
		
		for(int internalIndex=0;internalIndex<listOfBankAccount.size();internalIndex++)
		{
			if(listOfBankAccount.get(internalIndex).getAccountNo()==accountNo) {
				
				
				return listOfBankAccount.get(internalIndex);
			}
			
		}
		throw new RuntimeException("Account Number Non Existing");
		
		
		
	}
	
	public static List<BankAccount> sortByname() {
	/* Collections.sort(listOfBankAccount, new Comparator<BankAccount>()
	{
		 public int compare(BankAccount acc, BankAccount acc2) {
		        return acc.getAccountHolderName().compareTo(acc2.getAccountHolderName());
		    }
		
		
	});*/
	 listOfBankAccount.sort((BankAccount acc1,BankAccount acc2)->acc1.getAccountHolderName().compareTo(acc2.getAccountHolderName()));
	return listOfBankAccount;
	}
	
	
	public static void main(String[] args) {
		BankAccountListVer_2.addBankAccount(new BankAccount("Sanu",(double)1000.02));
		BankAccountListVer_2.addBankAccount(new BankAccount("Pandey",(double)2000.02));
		BankAccountListVer_2.addBankAccount(new BankAccount("Pragnya",(double)20000.02));
		BankAccountListVer_2.addBankAccount(new BankAccount("Dhrrubo",(double)5000.02));
		
		for(BankAccount acc:BankAccountListVer_2.getAllBankAccount())
			System.out.println(acc);
		System.out.println("=============================================");
		for(BankAccount acc:BankAccountListVer_2.sortByname())
			System.out.println(acc);
	}
}

