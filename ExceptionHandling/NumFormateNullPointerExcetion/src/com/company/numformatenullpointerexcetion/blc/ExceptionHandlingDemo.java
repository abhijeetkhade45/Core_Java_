package com.company.numformatenullpointerexcetion.blc;

public class ExceptionHandlingDemo {
	public static void handleExceptions(String s) {
		try {
			System.out.println("Length of the input string: "+s.length());
			int num=Integer.parseInt(s);
			System.out.println("Converted to integer: "+num);
			System.out.println("Uppercase version: "+s.toUpperCase());
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException: Input is not a valid integer. ");
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException: Input is null.");
		}
	}
	
}
