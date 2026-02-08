package com.company.carproject.elc;
import java.util.Scanner;

import com.company.carproject.blc.*;
public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Car Model :");
		String model=sc.nextLine();
		System.out.print("Enter Car Manufacturing year :");
		int year=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Car Price :");
		double price=Double.parseDouble(sc.nextLine());
		Car c1=new Car(model,year,price);
		System.out.println(c1);
	}

}
