package com.company.bankingpayment.blc;

public sealed interface Payment permits DebitCardPayment,UPIPayment,CreditCardPayment  {
	 void makePayment(double amount);
	 void makeRefund(double amount);
}
