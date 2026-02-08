package com.text.practice;
import java.util.*;
public class que6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n>=10) {
			int t=0;
			while(n>0) {
				t+=(n%10);
				n/=10;
			}
			n=t;
		}
		System.out.println(n);
	}

}
