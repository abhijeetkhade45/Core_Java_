package com.company.studentproject.elc;
import java.util.*;
import com.company.studentproject.blc.*;
public class TestStudent {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
			while(true) {
				System.out.print("Enter Student Nmae : ");
				String name=sc.nextLine();
				System.out.print("Enter Student age : ");
				int age=Integer.parseInt(sc.nextLine());
				System.out.print("Enter Student Grade : ");
				String grade=sc.nextLine();
				Student s=Student.createStudentObject(name, age, grade);
				System.out.println("Student Details :");
				System.out.print(s);
				System.out.print("\nDo user wants to continue to create and return more Student object or not [yes/no] : ");
				String uc=sc.nextLine();
				if(uc.equalsIgnoreCase("no")) {
					break;
				}
			
				
			}
			sc.close();
		
	}

}
