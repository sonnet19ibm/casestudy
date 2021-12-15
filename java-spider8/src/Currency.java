
public interface Currency {
	double dollarValue();
	
	Currency USD=() -> 1.0;
	Currency INR=() -> 75;
	
	static double convert(double amount,Currency source,Currency target) {
		double rate=target.dollarValue()/source.dollarValue();
		return rate*amount;
	}

}
