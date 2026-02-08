package com.company.employeeclass.blc;

public class EmployeeBluePrint {
	String employeeName;
	int employeeId;
	double employeeSalary;
	public void SetEmployeeInfo(String eName,int eId, double eSalary) {
		employeeName=eName;
        employeeId=eId;
	    employeeSalary=eSalary;
		
	}
	public void GetEmployeeInfo() {
		System.out.println("Employee Name :"+employeeName);
		System.out.println("Employee Id :"+employeeId);
		System.out.println("Employee Salary :"+employeeSalary);
	}
	
}
