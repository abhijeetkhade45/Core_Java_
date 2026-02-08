package com.company.employeeproject.elc;
import java.util.*;
import com.company.employeeproject.blc.*;
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int e=1;
		while(true) {
			System.out.println("Enter details for Employee "+e+":");
			System.out.print("Enter Employee ID: ");
			int id=Integer.parseInt(sc.nextLine());
			System.out.print("Enter Employee Name: ");
			String name=sc.nextLine();
			System.out.print("Enter Monthly Salary: ");
			double salary=Double.parseDouble(sc.nextLine());
			System.out.print("Enter Department (Sales, Engineering, HR, Other): ");
			String department=sc.nextLine();
			Employee s=Employee.createEmployeeObject(name,id,department,salary);
			System.out.print(s);
			System.out.print("\nDo user wants to continue to create and return more Student object or not [yes/no] : ");
			String uc=sc.nextLine();
			e++;
			if(uc.equalsIgnoreCase("no")) {
				break;
			}
		
		}
		sc.close();

	}

}
