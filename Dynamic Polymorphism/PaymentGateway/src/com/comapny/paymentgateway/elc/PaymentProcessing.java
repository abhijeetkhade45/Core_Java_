package com.comapny.paymentgateway.elc;
import com.comapny.paymentgateway.blc.*;
import java.util.Scanner;

public class PaymentProcessing {
	public static void main(String args[]) {
		Payment arr[]= {new CreditCardPayments(),new DebitCardPayment(),new UPI()};
		paymentGateway(arr);
	}
	public static void paymentGateway(Payment ...payment) {
		for(Payment p:payment) {
			p.processPayment();
		}
	}
}
