package com.company.bankingpayment.blc;

public final  class DebitCardPayment implements Payment {
	private String bankName;

	public DebitCardPayment(String bankName) {
		super();
		this.bankName = bankName;
	}
	@Override
	public void makePayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Starting checkout for amount RS :"+amount+"\n"
				+ "Paid RS :+amount+ using Debit Card Bank: "+bankName);
		
	}
	@Override
	public void makeRefund(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Order Canceled. Initiating Refund...\n"
				+ "Cancelling order for amount RS :"+amount+"\n"+"Refunded RS :"+amount+"to Debit Card Bank: "+bankName);
		
	}
}
