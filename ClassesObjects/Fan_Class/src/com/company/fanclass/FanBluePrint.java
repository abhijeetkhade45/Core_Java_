package com.company.fanclass;

public class FanBluePrint{
	String name;
	String coil;
	int wings;
	public void switchon() {
		System.out.println(name+" is starting ....");
	}
	public void switchoff() {
		System.out.println(name+" is stopping ....");
	}
}
