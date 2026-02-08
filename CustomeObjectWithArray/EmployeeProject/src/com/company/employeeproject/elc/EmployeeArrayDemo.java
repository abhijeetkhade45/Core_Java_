package com.company.employeeproject.elc;
import java.util.*;
import com.company.employeeproject.blc.*;
public class EmployeeArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of employees: ");
		int n=Integer.parseInt(sc.nextLine());
		Employee employee[]=new Employee[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter details for Employee "+i+1+":");
			
			System.out.println("Enter ID: ");
			int id=	Integer.parseInt(sc.nextLine());
			System.out.println("Enter Name: ");
			String name=sc.nextLine();
			System.out.println("Enter Salary: ");
			double salary=Double.parseDouble(sc.nextLine());
			employee[i]=new Employee(id,name,salary);
		}
		System.out.print("===== Employee Details =====");
		for(Employee emp:employee) {
			System.out.println(emp);
		}
		
	}

}
