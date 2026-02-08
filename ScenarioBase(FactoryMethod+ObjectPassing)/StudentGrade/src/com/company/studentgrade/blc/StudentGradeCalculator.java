package com.company.studentgrade.blc;
import com.comany.studentgrade.elc.CalculateStudentGrade;
import com.comany.studentgrade.elc.Student;
import com.comany.studentgrade.elc.StudentGrade;

import java.util.*;
public class StudentGradeCalculator {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in );
		System.out.println("Enter Student name : ");
		String name=sc.nextLine();
		System.out.println("Enter a Student marks : ");
		int marks=sc.nextInt();
		Student s=new Student(name,marks);
		StudentGrade stud=CalculateStudentGrade.calculateGrade(s);
		System.out.print(stud );
	}
}
