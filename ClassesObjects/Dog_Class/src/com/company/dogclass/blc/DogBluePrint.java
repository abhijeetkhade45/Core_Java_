package com.company.dogclass.blc;

public class DogBluePrint {
	public String name;
	public double height;
	public int age;
	public void getDogInformation() {
		System.out.println("Name : "+name);
		System.out.println("height : "+height+" feet");
		System.out.println("age : "+age+" year");
	}
	public void bark() {
		System.out.println(name+" is Barking.....");
	}
}
