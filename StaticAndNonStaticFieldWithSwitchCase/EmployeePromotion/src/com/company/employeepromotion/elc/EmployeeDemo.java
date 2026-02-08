package com.company.employeepromotion.elc;
import com.company.employeepromotion.blc.Employee;
import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee ID: ");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Employee Name: ");
		String name=sc.nextLine();
		System.out.println("Enter Employee Salary: ");
		double salary=Double.parseDouble(sc.nextLine());
		Employee e1=new Employee();
		e1.setEmployeeDetails(id, name, salary);
		System.out.println("----- Employee Information -----");
		System.out.println(e1.toString());
		System.out.println("----- Salary Increment Details -----");
		e1.calculateSalaryIncrement();
		
	}

}
