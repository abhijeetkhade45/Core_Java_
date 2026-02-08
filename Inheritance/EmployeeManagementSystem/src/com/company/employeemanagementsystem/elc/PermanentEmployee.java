package com.company.employeemanagementsystem.elc;

import com.company.employeemanagementsystem.elc.*;
public class PermanentEmployee extends Employee {
	
	protected double providentFund;

	public PermanentEmployee(int employeeId, String employeeName, double employeeSalary) {
		super(employeeId, employeeName, employeeSalary);
		this.providentFund = employeeSalary*0.12;
	}

	@Override
	public String toString() {
		return "PermanentEmployee [providentFund=" + providentFund + ", employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", employeeSalary=" + employeeSalary + "]";
	}
	
	public void netSalary() {
		System.out.println("Net salary : "+(providentFund+employeeSalary));
	}
	
	
	
	
}
