package com.nareshit.exam.elc;
import com.nareshit.exam.blc.*;
import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Customer Name: ");
		String cname=sc.nextLine();
		System.out.print("Enter Total Bill Amount: ");
		double amt=Double.parseDouble(sc.nextLine());
		double payamt=Discount.calculateDiscount(amt) ;
		System.out.println("Customer Name: "+cname);
		System.out.println("Original Bill: "+amt);
		System.out.println("Amount Payable after Discount: "+(amt-payamt));
		sc.close();
		
	}

}
