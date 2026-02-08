package com.company.employeedata.elc;
import java.util.*;

import com.company.employeedata.blc.Employee;
public class EmployeeArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of employees :");
		int numOfEmp=Integer.parseInt(sc.nextLine());
		
		Employee employee[]=new Employee[numOfEmp];
		for(int i=1;i<=numOfEmp;i++) {
			System.out.println("Enter details for Employee "+i+":");
			System.out.println("Enter ID: ");
			int id=Integer.parseInt(sc.nextLine());
			System.out.println("Enter Name:  ");
			String name=sc.nextLine();
			System.out.println("Enter Salary: ");
			double salary=Double.parseDouble(sc.nextLine());
			Employee emp=new Employee(id,name,salary);
			employee[i-1]=emp;
		}
		System.out.println("===== Employee Details =====");
		for(Employee emp:employee) {
			System.out.println(emp);
		}
	}

}
