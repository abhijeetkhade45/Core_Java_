package com.company.carclass;

public class CarBluePrint {
	String name;
	int model;
	String color;
	public void getInfo() {
		System.out.println("Name :"+name);
		System.out.println("Model :"+model);
		System.out.println("Color :"+color);
	}
	public void drive() {
		System.out.println(name+" is Driving...");
	}
}
