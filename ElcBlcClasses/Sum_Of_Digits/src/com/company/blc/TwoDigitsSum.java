package com.company.blc;

public class TwoDigitsSum{
	public static int getSumOfDigits(int num) {
		int sum=0;
		sum+=(num%10);
		num/=10;
		sum+=num;
		return sum;
	}
}
