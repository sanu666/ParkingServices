package com.Sanu.Bank;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class BankAccountMap {
	Map<Integer,BankAccount> bankAccountMap;
	
	public BankAccountMap()
	{
		bankAccountMap=new HashMap<>();
	}
	
	public void addBankAccountForEmployee(int employeeId, BankAccount acc)
	{
		bankAccountMap.put(employeeId, acc);
	}
	
	public Set<Integer> getAllEmployeeId()
	{
		return bankAccountMap.keySet();
	}
	
	public Collection<BankAccount> getAllBankAccount()
	{
		return bankAccountMap.values();
	}

}
