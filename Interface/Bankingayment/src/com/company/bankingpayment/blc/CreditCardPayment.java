package com.company.bankingpayment.blc;

public non-sealed class CreditCardPayment implements Payment {

	
	private String cardHolderName;
	public CreditCardPayment(String cardHolderName) {
		super();
		this.cardHolderName=cardHolderName;
	}
	@Override
	public void makePayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Starting checkout for amount RS :"+amount+"\n"
				+ "Paid RS :+amount+ using Credit Card Holder : "+cardHolderName);
		
	}
	@Override
	public void makeRefund(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Order Canceled. Initiating Refund...\n"
				+ "Cancelling order for amount RS :"+amount+"\n"+"Refunded RS :"+amount+"to to Credit Card Holder : "+cardHolderName);
		
	}
	
}
