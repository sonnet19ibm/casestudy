import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestAccount {
	private Account acnt;
	
	public void init() {
		acnt=new Account(1000);
	}
	
	public void testWithdraw() throws BalanceException{
		assertEquals(500,acnt.withdraw(500));
	}
	
	public void testInvalidWithdraw() {
		assertThrows(BalanceException.class,() -> acnt.withdraw(2000));
	}
	
	public void testNegativeWithdraw() {
		assertThrows(NumberFormatException.class,() -> acnt.withdraw(-100));
	}
	
	public void testDeposit() {
		assertEquals(2000,acnt.deposit(1000));
		
	}
	
	public void testNegativeDeposit() {
		assertThrows(NumberFormatException.class,()->acnt.deposit(-10));
		
	}

}
