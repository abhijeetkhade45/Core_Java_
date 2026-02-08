package com.company.payrollsystem.blc;

public class Manager {
	int mId;
	String mName;
	double bSalary;
	double HRAPer;
	double DAPer;
	double projAllowence;
	
	public Manager(int mId, String mName, double bSalary, double hRAPer, double dAPer, double projAllowence) {
		super();
		this.mId = mId;
		this.mName = mName;
		this.bSalary = bSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
		this.projAllowence = projAllowence;
	}

	public double calculateGrossSalary() {
		return (bSalary+(bSalary*(HRAPer/100.0))+(bSalary*(DAPer/100.0))+projAllowence);
	}
	
}
