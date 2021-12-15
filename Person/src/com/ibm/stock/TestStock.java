package com.ibm.stock;

public class TestStock {
	public static void main(String[] args) {
		//Stock tesla=new Stock();
		
		Holder h= StockSingleton.getStock();
		h.viewQuote();
		
		Broker b=StockSingleton.getStock();
		b.getQuote();
		
		System.out.println(h == b);
		
	}

}
