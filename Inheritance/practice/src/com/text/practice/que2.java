package com.text.practice;
import java.util.*;
public class que2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		int n=sc.nextInt();
		int n2=n;
		int t=0;
		while(n>0) {
			t=(t*10)+(n%10);
			n/=10;
		}
		if(t==n2) {
			System.out.print("Palindrome");
		}
		else {
			System.out.print("Not");
		}
	}

}
