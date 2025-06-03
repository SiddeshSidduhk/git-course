package com.bank.model;

public class Account {
	
	private String accountID;
	
	private String name;
	
	private double balance;
	
	
	public Account(String accountID,String name,double balance) {
		
		this.accountID=accountID;
		this.name=name;
		this.balance=balance;
		
	}
	
	public void deposit(double amount) {
		balance+=amount;
	}
	public boolean withdraw(double amount) {
		
		if(amount >balance) {
			return false;
		}else {
			balance-=amount;
			return true;
		}
		
		
		
	}

}
