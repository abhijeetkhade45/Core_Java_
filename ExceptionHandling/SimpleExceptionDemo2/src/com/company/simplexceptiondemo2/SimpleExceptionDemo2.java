package com.company.simplexceptiondemo2;
import java.util.*;
public class SimpleExceptionDemo2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[2];
		arr[0]=10;
		arr[1]=40;
		System.out.println("Enter index value:");
		int index=sc.nextInt();
	try {
		System.out.print(arr[index]);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("getMessage():=> "+e.getMessage());
		System.out.println("toString():=> "+e.toString());
		System.out.println("println():=> You tried to access an invalid array index. Please check the index range.");
		System.out.println("getMessage()=> "+e.getMessage());
		System.out.println("printStackTrace():=>  ");
		e.printStackTrace();
		
	}
		
		
	}
}