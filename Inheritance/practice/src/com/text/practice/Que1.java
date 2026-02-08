package com.text.practice;
import java.util.*;
public class Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num: ");
		int n=sc.nextInt();
		for(int i=2;i<=n-1;i++) {
			int c=0;
			for(int j=1;j<=(i);j++) {
				if(i%j==0) {
					c++;
					
				}
			}
			if(c==2) {
				System.out.println(i);
			}
			
		}
	}

}
