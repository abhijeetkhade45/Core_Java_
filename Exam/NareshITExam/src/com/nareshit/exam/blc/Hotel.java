package com.nareshit.exam.blc;

public class Hotel {

	public static double calculateTotalAmount(double roomRate,int days) {
		
		return roomRate*days;
		
	}
	public static double calculateDiscountedAmount(double amt,int days) {
		if(days>=1 && days<=2) {
			return (amt);
		}
		else if(days>=3 && days<=4) {
			return (amt-(amt*0.5));
		}
		else  if(days>=5 && days<=9) {
			return (amt-(amt*0.10));
		}
		else{
			return (amt-(amt*0.20));
		}
	}
	
}
