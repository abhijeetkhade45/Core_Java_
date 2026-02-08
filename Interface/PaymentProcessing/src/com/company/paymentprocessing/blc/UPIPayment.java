package com.company.paymentprocessing.blc;

public class UPIPayment implements Payment {

	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		System.out.println("Processing UPI payment...");
		
	}

	@Override
	public void applyDiscount() {
		// TODO Auto-generated method stub
		System.out.println("Applying 5% discount for UPI payment");
		
	}
	
}
