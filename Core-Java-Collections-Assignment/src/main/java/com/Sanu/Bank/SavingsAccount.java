package com.Sanu.Bank;

/**
 * 
 * @author sanbhatt
 * @since 2018-10-03
 * SavingsAccount inherits BankAcccount Class
 *
 */
public class SavingsAccount extends BankAccount {
	
	boolean isSalaryAccount;
	
	public SavingsAccount(String string, int i) {
		super();//calling the default constructor of parent Class
		isSalaryAccount=false;
	}

	public SavingsAccount(String accountHolderName, Double accountBalance, boolean isSalaryAccount) {
		super(accountHolderName, accountBalance);//calling parameterized constructor of parent Class
		this.isSalaryAccount = isSalaryAccount;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	
	public void withdraw(double amount)
	{
		
		if(isSalaryAccount && amount<=accountBalance)//accessing data members of parent class
		{
			accountBalance-=amount;
		}
		else if(isSalaryAccount!=true && amount<=accountBalance+2000)
		{
			accountBalance-=amount;
		}
		else
		{
			System.out.println("Withdraw Not possible amount too high");
		}
	}


	
	

}
