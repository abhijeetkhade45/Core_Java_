package com.company.bankcards.elc;
import com.company.bankcards.blc.*;
import java.util.*;
public class Bank {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Customer Name :");
	String name=sc.nextLine();
	System.out.print("Enter Crditpoints : ");
	int cpoint=sc.nextInt();
	Customer c=new Customer(name,cpoint);
	CardType card=CardOnOffer.getOfferCard(c);
	System.out.println(card);
}
}
