package com.company.loanbuisness.elc;
import java.util.*;
import com.company.loanbuisness.*;
import com.company.loanbuisness.blc.Loan;
public class CheckLoanDeatils {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("Enter a Loan Amount :");
		double principal=sc.nextDouble();
		System.out.print("Enter aInterest Rate :");
		double interestRate=sc.nextDouble();
		System.out.print("Enter a Duration in months :");
		int durationMonths=sc.nextInt();
		Loan l=new Loan(principal,interestRate,durationMonths);
		System.out.println("Princial : "+l.getPrincipal());
		System.out.println("Interest Rate : "+l.getInterestRate());
		System.out.print("Duration : "+l.getDurationMonths());
	}

}
