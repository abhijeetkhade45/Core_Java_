package com.company.employeeclass.elc;
import java.util.Scanner;

import com.company.employeeclass.blc.EmployeeBluePrint;
public class GetEmployee {
	public static void main(String argss[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a Employee Name : ");
		String employeeName=sc.nextLine();
		
		System.out.print("Enter a Employee Id : ");
		int employeeId=Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter a Employee Salary : ");
		double employeeSalary=Double.parseDouble(sc.nextLine());
		
		EmployeeBluePrint e1=new EmployeeBluePrint();
		 
		e1.SetEmployeeInfo(employeeName, employeeId, employeeSalary);
		e1.GetEmployeeInfo();
		sc.close();
		
	}
}

