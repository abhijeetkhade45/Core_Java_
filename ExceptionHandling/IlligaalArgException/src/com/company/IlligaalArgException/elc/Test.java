package com.company.IlligaalArgException.elc;
import java.util.*;

import com.company.IlligaalArgException.blc.AreaCalculator;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of rectangle:");
		int length=sc.nextInt();
		System.out.println("Enter width of rectangle:");
		int width=sc.nextInt();
		try {
		double area=AreaCalculator.calculateArea(length,width);
		System.out.println("Area of rectangle with length "+length+" and width "+width+" is: "+area);
		}
		catch(IllegalArgumentException e) {
			System.out.println("Error: Length and width must be > 0");
		}
	}

}
