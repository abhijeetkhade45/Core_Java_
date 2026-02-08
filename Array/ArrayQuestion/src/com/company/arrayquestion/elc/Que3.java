package com.company.arrayquestion.elc;

import java.util.Scanner;

public class Que3 {

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
		System.out.println("Sum of First & Last Element of Array :"+(arr[0]+arr[arr.length-1]));

	}

}
