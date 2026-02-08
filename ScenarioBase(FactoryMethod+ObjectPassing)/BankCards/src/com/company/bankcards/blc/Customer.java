package com.company.bankcards.blc;

public class Customer {
	private String cName;
	private int cPoint;
	public Customer(String cName, int cPoint) {
		super();
		this.cName = cName;
		this.cPoint = cPoint;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getcPoint() {
		return cPoint;
	}
	public void setcPoint(int cPoint) {
		this.cPoint = cPoint;
	}
	@Override
	public String toString() {
		return this.cName;
	}
	
	
}
