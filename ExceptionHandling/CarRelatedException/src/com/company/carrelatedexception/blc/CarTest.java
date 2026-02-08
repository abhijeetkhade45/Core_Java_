package com.company.carrelatedexception.blc;

public class CarTest  {
	public static void Stop(String s) throws CarStoppedException {
		if(s.equalsIgnoreCase("stop")) {
			throw new CarStoppedException("Car stopped for some reason");
		}
		else {
			System.out.println("Car not stalled");
		}
	}
	public static void CarHeatException(int temp) throws CarHeatException {
		if(temp>=50) {
			throw new CarHeatException("Car is heated more than 50 degrees Celsius.");
		}
		else {
			System.out.println("Car temperature normal");
		}
	}
	public static void puncture(String s) throws CarPunctureException {
		if(s.equalsIgnoreCase("stop")) {
			throw new CarPunctureException("Car is punctured.");
		}
		else {
			System.out.println("Car not punctured.");
		}
	}
	
}
