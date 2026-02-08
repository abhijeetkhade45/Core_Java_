package com.company.arithmeticexception.blc;

public class DivisionExample {
	
	public static int performDivision(int number,int divisor) {
		
			if(divisor==0) {
				throw new ArithmeticException("");
			}
			return number/divisor;
		
		
	}

}
