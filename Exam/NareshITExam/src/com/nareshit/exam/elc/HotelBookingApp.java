package com.nareshit.exam.elc;

import java.util.Scanner;

import com.nareshit.exam.blc.Hotel;

public class HotelBookingApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("Enter Customer Name: ");
		String cname=sc.nextLine();
		System.out.print("Enter Hotel Name: ");
		String hname=sc.nextLine();
		System.out.print("Enter Room Rate per Day: ");
		double rate=Double.parseDouble(sc.nextLine());
		System.out.print("Enter Number of Days Stayed: ");
		int days=Integer.parseInt(sc.nextLine());
		System.out.println("----- HOTEL BOOKING SUMMARY ----- ");
		System.out.println("Customer Name    :"+cname);
		System.out.println("Hotel Name     :"+hname);
		System.out.println("Room Rate (per day): "+rate);
		System.out.println("Days Stayed     : "+days);
		System.out.println("Total Amount      : ₹"+(Hotel.calculateTotalAmount(rate, days)));
		System.out.println("Amount after Discount: ₹"+(Hotel.calculateDiscountedAmount(Hotel.calculateTotalAmount(rate, days), days)));
		sc.close();
		
		
		
		
	}

}
