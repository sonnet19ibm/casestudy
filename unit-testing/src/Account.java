
public class Account {
	private double balance;
	
	public Account() {
		
	}
	
	public Account(double balance) {
		this.balance=balance;
	}
	
	public double deposit(double amount) throws NumberFormatException{
		if(amount<0)
			throw new NumberFormatException("negative amount");
		balance+=amount;
		return balance;
	}
	
	public double withdraw(double amount) throws balanceException{
		if(amount<0)
			throw new NumberFormatException("negative amount");
		
		if(amount>balance)
			throw 
	}

}
