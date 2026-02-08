package com.company.bankingmanagementsystem.elc;

import java.util.Scanner;
import com.company.bankingmanagementsystem.blc.*;
public class BankCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int accNum;
		double balance;
		Bank.bankName="ICICI";
		Bank.bankIFSCCode="ICICI000115";
		Bank.bankAddress="AMMERPET, HYD";
		Bank icici=new Bank();
		Scanner sc=new Scanner(System.in);
		System.out.println("===== Welcome to ICICI Bank =====");
		System.out.print("Enter Customer Name : ");
		name=sc.nextLine();
		System.out.print("Enter Account Number : ");
		accNum=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Opening Balance : ");
		balance=Double.parseDouble(sc.nextLine());
		icici.setCustomerDeatils(name,accNum,balance);
		System.out.println("Customer account created successfully! ");
		while(true) {
			System.out.println("\n===== MENU =====");
			System.out.println("1. Deposit\r\n"
					+ "2. Withdraw\r\n"
					+ "3. Check Balance\r\n"
					+ "4. Display Customer Details\r\n"
					+ "5. Exit");
			System.out.println("Enter your choice: ");
			int choice=Integer.parseInt(sc.nextLine());
			switch(choice) {
			case 1 -> {
				System.out.print("Enter deposit amount: ");
				double amount=Double.parseDouble(sc.nextLine());
				icici.deposit(amount);
				System.out.println("Deposit successful!"+amount +"credited.");
				
			}
			case 2 ->{
				System.out.print("Enter withdrawal amount: ");
				double amount=Double.parseDouble(sc.nextLine());
				icici.withdraw( amount);
				System.out.println("Withdrawal successful!"+ amount+" debited.");
			}
			case 3 -> {
				System.out.println("Current Balance: "+icici.getCurrentBalance());
			}
			case 4 ->{
				System.out.println(icici.displayDetails());
			}
			case 5-> {
				System.out.println("Thank you for banking with ICICI Bank!");
				System.exit(0);;
			}
			}
		}
		
	}
	

}
