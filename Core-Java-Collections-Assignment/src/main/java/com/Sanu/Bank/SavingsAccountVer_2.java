package com.Sanu.Bank;

public class SavingsAccountVer_2 extends SavingsAccount implements Insurance{
	
	

	public SavingsAccountVer_2(String accountHolderName, Double accountBalance, boolean isSalaryAccount) {
		super(accountHolderName, accountBalance, isSalaryAccount);
		// TODO Auto-generated constructor stub
	}

	public String getInsuranceName() {
		// TODO Auto-generated method stub
		return "Savings Insurance Jeevan Beema";
	}

	public int getInsuranceDuration() {
		// TODO Auto-generated method stub
		return 8;
	}

	public double getInsurancePremium() {
		// TODO Auto-generated method stub
		return 412.29;
	}

	@Override
	public String toString() {
		return "SavingsAccountVer_2 [isSalaryAccount=" + isSalaryAccount + ", accountNo=" + accountNo
				+ ", accountHolderName=" + accountHolderName + ", accountBalance=" + accountBalance
				+ ", getInsuranceName()=" + getInsuranceName() + ", getInsuranceDuration()=" + getInsuranceDuration()
				+ ", getInsurancePremium()=" + getInsurancePremium() + ", isSalaryAccount()=" + isSalaryAccount()
				+ ", getAccountHolderName()=" + getAccountHolderName() + ", getAccountBalance()=" + getAccountBalance()
				+ ", getAccountNo()=" + getAccountNo() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
