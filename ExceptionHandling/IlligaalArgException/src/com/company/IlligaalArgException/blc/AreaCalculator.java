package com.company.IlligaalArgException.blc;

public class AreaCalculator {
	public static double calculateArea(double length,double width) {
		if(length<=0 || width<=0) {
			throw new IllegalArgumentException();
		}
		else {
			return length*width;
		}
	}
}
