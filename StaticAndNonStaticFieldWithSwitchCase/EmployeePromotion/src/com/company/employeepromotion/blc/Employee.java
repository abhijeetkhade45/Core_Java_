package com.company.employeepromotion.blc;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
	public void setEmployeeDetails(int id,String name,double salary) {
		
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	public void calculateSalaryIncrement() {
		double incsalary;
		
		if(salary>80000) {
			incsalary=(salary*5);
		}
		else if(salary<=80000 && salary>=50000) {
			incsalary=(salary*0.7);
		}
		else {
			incsalary=(salary*0.10);
		}
		System.out.println("Salary Increment Amount: "+incsalary);
		System.out.println("Updated Salary: "+(salary+incsalary));
		
		
		
	}
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
