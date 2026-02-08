package com.company.payrollsystem.blc;

public class Trainer {
	int tId;
	String tName;
	double bSalary;
	double HRAPer;
	double DAPer;
	int batchCount;
	double perkPerBatch;
	
	public Trainer(int tId, String tName, double bSalary, double hRAPer, double dAPer, int batchCount,
			double perkPerBatch) {
		super();
		this.tId = tId;
		this.tName = tName;
		this.bSalary = bSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
		this.batchCount = batchCount;
		this.perkPerBatch = perkPerBatch;
	}

	public double calculateGrossSalary() {
		return (bSalary+(bSalary*(HRAPer/100.0))+(bSalary*(DAPer/100.0))+(batchCount*perkPerBatch ));
	}
}
