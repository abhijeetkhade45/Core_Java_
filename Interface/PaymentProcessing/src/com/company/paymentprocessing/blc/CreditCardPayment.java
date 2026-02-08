package com.company.paymentprocessing.blc;

public class CreditCardPayment implements Payment {

	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		System.out.println("Processing Credit Card payment...");
		
	}

	@Override
	public void applyDiscount() {
		// TODO Auto-generated method stub
		System.out.println("Applying 10% discount for Credit Card payment");
		
	}
	
}
