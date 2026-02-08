package com.company.carproject.blc;

public class Car {
	private String model;
	private int year;
	private double price;
	public Car(String model,int year,double price){
		this.model=model;
		this.year=year;
		this.price=price;
		if(year<=2010) {
			System.out.println("year must be greater than 2010");
			if(price<0) {
				System.out.print("Price must be positive integer");
				System.exit(0);
				
			}
			System.exit(0);
		}
	}
	@Override
	public String toString() {
		
		return "Car [model=" + model + ", year=" + year + ", price=" + price + "]";
	}
	
}
