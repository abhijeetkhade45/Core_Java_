package com.company.bankingmanagementsystem.blc;

public class Bank {
	
	private String customerName;
	private int accountNumber;
	private double currentBalance;
	public static String bankName;
	public static String bankAddress;;
	public static String bankIFSCCode;;
	
	public void setCustomerDeatils(String name, int accNumber,double balance)
	{
		customerName=name;
		accountNumber=accNumber;
		if(balance <=0) {
			System.err.print("Balance Cannot be Zero Or Negative");
			System.exit(0);
		}
		else {
			currentBalance=balance;
		}
	}
	public void withdraw(double amount){
		if(amount>currentBalance) {
			System.err.print("You have insufficient balance");
			System.exit(0);
		}
		else {
			currentBalance-=amount;
		}
		
	}
	public void deposit(double amount) {
		if(amount<=0) {
			System.err.print("Zero Or Negative Amount Cannot be deposited");
			System.exit(0);
		}
		else {
			currentBalance+=amount;
		}
	}
	public double  getCurrentBalance() {
		return currentBalance;
	}
	public String displayDetails() {
		return "[ Name = "+customerName+" AccountNumber= "+accountNumber+" Balance= "+currentBalance+" ]";
	}
	

}
