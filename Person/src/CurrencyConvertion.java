
public class CurrencyConvertion {
	
	private int usd;
	private int inr;
	
	public CurrencyConvertion() {
		
	}
	
	public CurrencyConvertion(int usd,int inr) {
		this.usd=usd;
		this.inr=inr;
	}
	
	public void Conversion(int usd,int inr) {
		
		usd=inr*75;
		System.out.println(usd);
		
	}

}
