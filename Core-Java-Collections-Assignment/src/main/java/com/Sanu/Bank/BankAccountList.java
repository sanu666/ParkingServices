package com.Sanu.Bank;

import java.awt.List;

public class BankAccountList {
	
	private static  BankAccount[] ListOfBankAccount= new BankAccount[100];
	  static int count=0;
	public static BankAccount addBankAccount(BankAccount bankAcc)
	{
		
		ListOfBankAccount[count++]=bankAcc;
		return bankAcc;
		
	}
	
	
	public static BankAccount[] getAllBankAccount()
	{
		return ListOfBankAccount;
	}
	
	
	public static BankAccount[] updateBankAccount(int accNo,String accountHolderName)
	{
		for(int internalIndex=0;internalIndex<count;internalIndex++)
		{
			if(ListOfBankAccount[internalIndex].getAccountNo()==accNo) {
				ListOfBankAccount[internalIndex].setAccountHolderName(accountHolderName);
				return ListOfBankAccount;
			}
		}
		
		
		throw new RuntimeException("Account Number Non Existing");
		
		
	}
	
	public static BankAccount[] removeBankAccount(int accNo)
	{
		
		for(int internalIndex=0;internalIndex<=count;internalIndex++)
		{
			if(ListOfBankAccount[internalIndex].getAccountNo()==accNo) {
				
				for(int swapIndex=internalIndex;swapIndex<count-1;swapIndex++)
					ListOfBankAccount[swapIndex]=ListOfBankAccount[swapIndex+1];
				  return ListOfBankAccount;
			}
			
		}
		throw new RuntimeException("Account Number Non Existing");
		
	}
	public static BankAccount getBankAccountByAccountNumber(int accountNo)
	{
		
		for(int i=0;i<count;i++)
		{
			if(ListOfBankAccount[i].getAccountNo()==accountNo)
				return ListOfBankAccount[i];
		}
		throw new RuntimeException("Account Number Non Existing");
		
		
		
	}

}
