package com.company.employeemanagementsystem.elc;
import com.company.employeemanagementsystem.elc.Employee;
public class ContractEmployee extends Employee {
	
	protected int contractDuration;

	public ContractEmployee(int employeeId, String employeeName, double employeeSalary, int contractDuration) {
		super(employeeId, employeeName, employeeSalary);
		this.contractDuration = contractDuration;
	}

	@Override
	public String toString() {
		return "ContractEmployee [contractDuration=" + contractDuration + ", employeeId=" + employeeId
				+ ", employeeName=" + employeeName + ", employeeSalary=" + employeeSalary + "]";
	}
	
	
	

}
