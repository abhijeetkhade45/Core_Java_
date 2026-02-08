package com.company.simpleexceptiondemo.elc;
import java.util.*;
public class SimpleExceptionDemo {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a & b value:");
	try {
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.print("You entered a = "+a+" and b = "+b);
	}
	catch(Exception e) {
		System.out.println("getMessage():=> "+e.getMessage());
		System.out.println("toString():=> "+e.toString());
		System.out.println("println():=> InputMismatchException occurred. Please enter only integer numbers.");
		System.out.println("getMessage()=> "+e.getMessage());
		System.out.println("printStackTrace():=>  ");
		e.printStackTrace();
		
	}
		
		
	}
}
