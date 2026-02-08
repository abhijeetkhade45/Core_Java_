package com.company.paymentmanagement.elc;
import com.company.paymentmanagement.blc.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Payable() {
			public void pay() {
				System.out.println("Employee Paying");
			}
		}.pay();
		new Payable() {
			public void pay() {
				System.out.println("Contractor Paying");
			}
		}.pay();
	}

}
