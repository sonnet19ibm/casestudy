package com.ibm.bank;
/**
 * about the detail of accounts
 * @author 002UMX744 Pravallika
 *
 */
public class Accounts implements Bank {
	private int actNo;
	private String holder;
	protected double balance;
	
	public static final int INIT_ACCOUNT_NO = 1001;
	public static final double MIN_SAVINGS_BAL=1000;
	public static final double INIT_CURRENT_BAL=5000;
	public static final double MIN_CURRENT_BAL=0;
	public static final double OVERDRAFT_LIMIT=10000;
	
	
	private static int counter;
	
	static{
		System.out.println("Account loded");
		counter=INIT_ACCOUNT_NO;
	}
	
	public Accounts() {
		
	}
	
	public Accounts(String holder,double balance) {
		this.actNo= counter++;
		this.holder=holder;
		this.balance=balance;
	}
	public void Summary(){
		System.out.println("A/cNO"+actNo);
		System.out.println("Holder"+holder);
		System.out.println("balance "+balance);
		
	}
	public void deposit(double amount) {
		balance+=amount;
	}
	public void withdraw(double amount) {
		if(amount <= balance)
		{
			balance-=amount;
			System.out.println(balance);
		}
		else {
			System.out.println("insufficient balance");
		}
	}


}
