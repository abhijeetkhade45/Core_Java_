package com.company.bankingpayment.blc;

public class ShoppingCart {
	private double totalAmount;

	public ShoppingCart(double totalAmount) {
		super();
		this.totalAmount = totalAmount;
	}
	public void checkout(Payment payment) {
		payment.makePayment(totalAmount);
	}
	public void cancelOrder(Payment payment) {
		payment.makeRefund(totalAmount);
	}
}
