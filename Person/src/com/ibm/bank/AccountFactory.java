package com.ibm.bank;

public class AccountFactory {
	
	public void openAccount(String holder,String acType) {
		Bank acnt=null;
		
		if(acType.equals("Savings"))
			acnt=new Savings(holder);
	}

}
