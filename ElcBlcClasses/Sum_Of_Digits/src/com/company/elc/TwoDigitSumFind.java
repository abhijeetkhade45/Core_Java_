package com.company.elc;
import java.util.Scanner;

import com.company.blc.TwoDigitsSum;
public class TwoDigitSumFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a any Two Digit Number : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(TwoDigitsSum.getSumOfDigits(num));
		sc.close();
	}

}
