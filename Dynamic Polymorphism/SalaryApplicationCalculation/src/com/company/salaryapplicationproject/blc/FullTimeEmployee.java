package com.company.salaryapplicationproject.blc;
import com.company.salaryapplicationproject.blc.*;
public class FullTimeEmployee extends Employee{
	protected double salary;
	FullTimeEmployee(int id,String name,double salary){
		super(id,name);
		this.salary=salary;
	}
	public void double calculateSalary() {
		return salary; 
	}
}
