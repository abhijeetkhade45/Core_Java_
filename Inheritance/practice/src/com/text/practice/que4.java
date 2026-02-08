package com.text.practice;
import java.util.*;
public class que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		System.out.print(fact);

	}

}
