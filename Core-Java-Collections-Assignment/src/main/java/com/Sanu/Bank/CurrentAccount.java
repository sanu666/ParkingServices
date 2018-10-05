package com.Sanu.Bank;

public class CurrentAccount extends BankAccount{
	
	double odLimit;

	public CurrentAccount(String accountHolderName, Double accountBalance, double odLimit) {
		super(accountHolderName, accountBalance);
		this.odLimit = odLimit;
	}

	public CurrentAccount() {
		super();
		odLimit=2000;
	}

	public double getOdLimit() {
		return odLimit;
	}

	public void setOdLimit(double odLimit) {
		this.odLimit = odLimit;
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	

}
