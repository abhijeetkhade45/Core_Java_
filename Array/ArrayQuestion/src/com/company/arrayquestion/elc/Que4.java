package com.company.arrayquestion.elc;

import java.util.Scanner;

public class Que4 {

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
		System.out.print("Even Elements : ");
		for(int i=0;i<size;i++) {
			if(arr[i]%2==0) {
			System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.print("Odd Elements : ");
		for(int i=0;i<size;i++) {
			if(arr[i]%2!=0) {
			System.out.print(arr[i]+" ");
			}
		}
	}

}
