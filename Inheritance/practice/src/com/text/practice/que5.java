package com.text.practice;
import java.util.*;
public class que5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=n;
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(t==sum) {
			System.out.print("Perfect");
		}
		else {
			System.out.print("Not");
		}
	}

}
