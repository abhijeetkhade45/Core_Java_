package com.company.employeeproject.elc;
import com.company.employeeproject.blc.*;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("firstName: ");
		String firstName=sc.nextLine();
		System.out.print("lastName: ");
		String lastName=sc.nextLine();
		System.out.print("employeeId: ");
		int employeeId=Integer.parseInt(sc.nextLine());
		System.out.print("salary: ");
		double salary =Double.parseDouble(sc.nextLine());
		System.out.print("NoOfProject: ");
		int NoOfProject=Integer.parseInt(sc.nextLine());
		Employee e1=new Employee(lastName, lastName, employeeId, salary, NoOfProject);
		e1.calculateSalary();
		System.out.println(e1.toString());
	}

}
