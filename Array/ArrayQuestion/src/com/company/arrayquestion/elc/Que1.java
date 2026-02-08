package com.company.arrayquestion.elc;
import java.util.*;
public class Que1 {

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
		System.out.println("Enter searching element :");
		int element=sc.nextInt();
		for(int i=0;i<size;i++) {
			if(arr[i]==element) {
				System.out.println("Element found at index "+i);
				System.exit(0);
			}
		}
		System.out.println("Element not found");
	}

}
