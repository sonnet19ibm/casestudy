package com.ibm.bank;

public class Savings extends Accounts {

	public Savings() {
		
		// TODO Auto-generated constructor stub
	}

	public Savings(String holder) {
		super(holder, MIN_SAVINGS_BAL);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount <= (balance-MIN_SAVINGS_BAL))
			balance-=amount;
		else
			System.out.println("over");
	}

	
	
	
	

}
