package com.company.paymentprocessing.blc;
import com.company.paymentprocessing.blc.*;
public class PaymentGateway {
	
	public Payment initiatePayment(String paymentType ) {
		if(paymentType.equalsIgnoreCase("creditcard")) {
			System.out.println("Initiating Credit Card payment");
			return new CreditCardPayment();
		}
		else {
			System.out.println("Initiating UPI payment");
			return new UPIPayment();
		}
	}

}
