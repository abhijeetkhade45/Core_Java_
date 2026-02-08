package com.company.employeeproject.blc;
public class Employee {
private String firstName;
private String lastName;
private int employeeId;
private double salary;
private int NoOfProject;

public Employee( String firstName, String lastName, int employeeId, double salary, int NoOfProject) {
	this.firstName=firstName;
	this.lastName=lastName;
	this.employeeId=employeeId;
	this.salary=salary;
	this.NoOfProject=NoOfProject;
	
}
public void calculateSalary() {
	if(NoOfProject>5 && NoOfProject<10) {
salary+=5000;
}
	else if(NoOfProject>10 && NoOfProject<20) {
		salary+=10000;
	}
	else if(NoOfProject>20){
		salary+=15000;
	}
	
	if(NoOfProject<0) {
		System.out.print("Number of projects cannot be negative");
		System.exit(0);
	}
}

@Override
public String toString() {
	return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId + ", salary="
			+ salary + ", NoOfProject=" + NoOfProject + "]";
}

}
