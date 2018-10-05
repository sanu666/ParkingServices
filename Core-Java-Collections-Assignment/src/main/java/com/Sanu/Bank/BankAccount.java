package com.Sanu.Bank;

public  class BankAccount implements Comparable<BankAccount>{
	
	int accountNo;
	String accountHolderName;
	Double accountBalance;
	static int autoAccCountGen;
	
	
	public BankAccount(String accountHolderName, Double accountBalance) {
		super();
		accountNo=++autoAccCountGen;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	
	public BankAccount() {
		accountNo=++autoAccCountGen;
		accountBalance=0.0;
		accountHolderName="Unknown";
	}
	
	
	public  void withdraw(double amount)
	{
		
	}
	
	public void deposit(double amount)
	{
		accountBalance+=amount;
	}
	
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public Double getAccountBalance() {
		return accountBalance;
	}
	
	public static int getAutoAccCountGen() {
		return autoAccCountGen;
	}
	
	
	public int getAccountNo() {
		return accountNo;
	}
	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", accountBalance="
				+ accountBalance + "]";
	}

	@Override
	public int compareTo(BankAccount acc) {
		return getAccountNo()+acc.getAccountNo();
		
	}

	

	}


