package com.comapny.bankingpayment.elc;
import java.util.*;
import com.company.bankingpayment.blc.*;
import com.company.bankingpayment.blc.CreditCardPayment;
import com.company.bankingpayment.blc.ShoppingCart;
public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter your total bill Amount :");
	    double amount=Double.parseDouble(sc.nextLine());
	    System.out.println("Choose Payment Method:");
	    System.out.println("1. Credit Card");
	    System.out.println("2. Debit Card");
	    System.out.println("3. UPI");
	    int choice=Integer.parseInt(sc.nextLine());
	    switch(choice) {
	    case 1:{
	    	ShoppingCart shoppingcart=new ShoppingCart(amount);
	    	Payment payment=new CreditCardPayment("MR. Ravi");
	    	shoppingcart.checkout(payment);
	    	System.out.println();
	    	shoppingcart.cancelOrder(payment);
	    	break;	  
	    	}
	    case 2:{
	    	ShoppingCart shoppingcart=new ShoppingCart(amount);
	    	Payment payment=new DebitCardPayment("State Bank of India");
	    	shoppingcart.checkout(payment);
	    	System.out.println();
	    	shoppingcart.cancelOrder(payment);
	    	break;	  
	    	}
	    case 3:{
	    	ShoppingCart shoppingcart=new ShoppingCart(amount);
	    	Payment payment=new UPIPayment("reach_scott@upi");
	    	shoppingcart.checkout(payment);
	    	System.out.println();
	    	shoppingcart.cancelOrder(payment);
	    	break;	  
	    	}
	    
	    
		
	}
	}
}
