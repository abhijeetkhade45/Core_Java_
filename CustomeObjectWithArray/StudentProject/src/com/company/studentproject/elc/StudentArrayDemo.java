package com.company.studentproject.elc;
import java.util.*;
import com.company.studentproject.blc.*;
public class StudentArrayDemo {
	public static void main(String args[]) {
		Student student[]=new Student[3];
		student[0]=new Student(101,"Ravi",89.5);
		student[1]=new Student(102,"Anita",92.0);
		student[2]=new Student(103,"Kiran",85.75);
		for(Student stud:student) {
			System.out.println(stud);
		}
	}
}
