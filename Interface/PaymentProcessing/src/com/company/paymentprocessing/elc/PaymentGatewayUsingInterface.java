package com.company.paymentprocessing.elc;
import com.company.paymentprocessing.blc.*;
import java.util.*;
public class PaymentGatewayUsingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Payment Type [CreditCard / UPI]:");
		String paymetType=sc.nextLine();
		PaymentGateway paymentgateway = new PaymentGateway();
		Payment payment =paymentgateway.initiatePayment(paymetType);
		payment.processPayment();
		payment.applyDiscount();
	}

}
