package com.company.arrayquestion.elc;

import java.util.Scanner;

public class Que5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array :");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter Array Elements :");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		if((arr.length)%2!=0) {
			System.out.println("Middle Element : "+arr[arr.length/2]);
		}
		else {
			System.out.println("Middle Elements : "+arr[arr.length/2-1]+" "+arr[arr.length/2]);
		}

	}

}
