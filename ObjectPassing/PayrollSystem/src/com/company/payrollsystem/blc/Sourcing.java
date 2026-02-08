package com.company.payrollsystem.blc;

public class Sourcing {
	int sId;
	String sName;
	double bSalary;
	double HRAPer;
	double DAPer;
	int enrollmentTarget;
	int enrollmentReached;
	double perkPerEnrollment;
	public Sourcing(int sId, String sName, double bSalary, double hRAPer, double dAPer, int enrollmentTarget,
			int enrollmentReached, double perkPerEnrollment) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.bSalary = bSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
	}

	public double calculateGrossSalary() {
		return (bSalary+(bSalary*(HRAPer/100.0))+(bSalary*(DAPer/100.0))+(((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment));

}
}
