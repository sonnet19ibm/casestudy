package com.ibm.bank;

public class Current extends Accounts {

	private double overdraft;

	public Current() {
	
		// TODO Auto-generated constructor stub
	}

	public Current(String holder) {
		super(holder, INIT_CURRENT_BAL);
		this.overdraft=OVERDRAFT_LIMIT;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Summary() {
		// TODO Auto-generated method stub
		super.Summary();
		System.out.println("Overdraft:"+overdraft);
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		if(overdraft<10000){
			overdraft+=amount;
			System.out.println("deposit"+overdraft);
			
		}
		else if(overdraft==1000){
			balance+=amount;
			System.out.println("deposit"+balance);
		}
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount<=balance) {
			balance-=amount;
			System.out.println("withdraw"+balance);
		}
		else if(amount>balance && amount<=overdraft) {
			overdraft-=amount;
			System.out.println("withdraw"+overdraft);
		}
	}
	
	

}
