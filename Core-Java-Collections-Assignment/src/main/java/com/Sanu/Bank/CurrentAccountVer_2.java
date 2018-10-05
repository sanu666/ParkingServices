package com.Sanu.Bank;

public class CurrentAccountVer_2 extends CurrentAccount implements Insurance {

	public String getInsuranceName() {
		// TODO Auto-generated method stub
		return "Current ";
	}

	public int getInsuranceDuration() {
		// TODO Auto-generated method stub
		return 60;
	}

	public double getInsurancePremium() {
		// TODO Auto-generated method stub
		return 65.23;
	}

	@Override
	public String toString() {
		return "CurrentAccountVer_2 [odLimit=" + odLimit + ", accountNo=" + accountNo + ", accountHolderName="
				+ accountHolderName + ", accountBalance=" + accountBalance + ", getInsuranceName()="
				+ getInsuranceName() + ", getInsuranceDuration()=" + getInsuranceDuration() + ", getInsurancePremium()="
				+ getInsurancePremium() + ", getOdLimit()=" + getOdLimit() + ", getAccountHolderName()="
				+ getAccountHolderName() + ", getAccountBalance()=" + getAccountBalance() + ", getAccountNo()="
				+ getAccountNo() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	

}
