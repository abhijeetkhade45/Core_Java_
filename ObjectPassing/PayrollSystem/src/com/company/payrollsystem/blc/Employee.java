package com.company.payrollsystem.blc;

public class Employee {
	int eId;
	String eName;
	double bSalary;
	double HRAPer;
	double DAPer;
	

	public Employee(int eId, String eName, double bSalary, double hRAPer, double dAPer) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.bSalary = bSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
	}


	public double calculateGrossSalary() {
		return (bSalary+(bSalary*(HRAPer/100.0))+(bSalary*(DAPer/100.0)));
	}
}
