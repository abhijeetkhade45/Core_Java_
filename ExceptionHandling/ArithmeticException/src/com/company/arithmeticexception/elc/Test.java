package com.company.arithmeticexception.elc;
import java.util.*;

import com.company.arithmeticexception.blc.DivisionExample;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter dividend : ");
		int num1=sc.nextInt();
		System.out.println("Enter divisor : ");
		int divisor=sc.nextInt();
		try {
			int ans=DivisionExample.performDivision(num1, divisor);
			System.out.println("Result of division :"+ans);
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException caught: Division by zero: dividend=5, divisor=0");
		}
	}

}
