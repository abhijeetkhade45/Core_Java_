package com.company.employeeproject.blc;

public class Employee {
	private String name;
	private int id;
	private String departname;
	private double salary;
	public Employee(String name, int id, String departname, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.departname = departname;
		this.salary = salary;
	}
	public double calculateAnnualSalary(){
		double asalary=12*salary;
		if( departname.equalsIgnoreCase("Sales")) {
			return asalary+(asalary*0.10);
		}
		else if( departname.equalsIgnoreCase("Engineering")) {
			return asalary+(asalary*0.15);
		}
		else if( departname.equalsIgnoreCase("HR")) {
			return asalary+(asalary*0.8);
		}
		else {
			return asalary+(asalary*0.5);
		}
	}
	public static Employee createEmployeeObject(String name,int id,String department,double salary) {
		return new Employee(name,id,department,salary);
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", departname=" + departname + ", salary=" + salary + "]\n"+"Annual Salary (with Bonus): "+calculateAnnualSalary();
	}
	
}
