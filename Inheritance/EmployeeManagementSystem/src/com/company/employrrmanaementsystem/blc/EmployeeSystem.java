package com.company.employrrmanaementsystem.blc;
import java.util.*;
import com.company.employeemanagementsystem.elc.*;
public class EmployeeSystem {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter permanent employee Id :");
		int employeeId=Integer.parseInt(sc.nextLine());
		System.out.print("Enter permanent employee Name :");
		String employeeName=sc.nextLine();
		System.out.print("Enter permanent employee Salary :");
		double employeeSalary=Double.parseDouble(sc.nextLine());
		PermanentEmployee permanentemployee=new PermanentEmployee(employeeId,employeeName,employeeSalary);
		System.out.println(permanentemployee);
		permanentemployee.netSalary();
		System.out.println("========================================");
		System.out.print("Enter contract employee Id :");
		int cemployeeId=Integer.parseInt(sc.nextLine());
		System.out.print("Enter contract employee Name :");
		String cemployeeName=sc.nextLine();
		System.out.print("Enter contract employee Salary :");
		double cemployeeSalary=Double.parseDouble(sc.nextLine());
		System.out.print("Enter contract duration in year :");
		int cemployeeDuration=sc.nextInt();
		ContractEmployee contractemployee=new ContractEmployee(employeeId,employeeName,employeeSalary,cemployeeDuration);
		System.out.println(permanentemployee);
	}

}
