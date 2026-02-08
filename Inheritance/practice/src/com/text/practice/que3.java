package com.text.practice;

import java.util.Scanner;

public class que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=n;
		String s="";
		s+=n;
		int sum=0;
		while(n>0) {
			sum+=(Math.pow((n%10),s.length()));
			n/=10;
		}
		if(t==sum) {
			System.out.print("AmrStrong");
		}
		else {
			System.out.print("Not");
		}
	}

}
