package com.company.bankingpayment.blc;

public final class UPIPayment implements Payment {
	private String upiId;

	public UPIPayment(String upiId) {
		super();
		this.upiId = upiId;
	}

	@Override
	public void makePayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Starting checkout for amount RS :"+amount+"\n"
				+ "Paid RS" +amount+ "using UPI ID : "+upiId);
		
	}

	@Override
	public void makeRefund(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Order Canceled. Initiating Refund...\n"
				+ "Cancelling order for amount RS :"+amount+"\n"+"Refunded RS :"+amount+"to UPI ID : "+upiId);
		
	}
	

}
