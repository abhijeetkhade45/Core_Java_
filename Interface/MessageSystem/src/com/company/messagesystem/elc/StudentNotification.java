package com.company.messagesystem.elc;
import java.util.*;
import com.company.messagesystem.blc.*;
import java.util.function.*;
public class StudentNotification {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int noOfStud=Integer.parseInt(sc.nextLine());
		for(int i=1;i<=noOfStud;i++) {
			System.out.println("Enter details for Student" +i+": ");
			System.out.print("Enter ID: ");
			int id=Integer.parseInt(sc.nextLine());
			System.out.print("Enter Name: ");
			String name=sc.nextLine();
			System.out.print("Enter Course: ");
			String course=sc.nextLine();
			Student student=new Student(id,name,course);
			Consumer<Student> register=stud->System.out.println("Hello "+stud.name()+"! Welcome to "+stud.course()+"course.");
			register.accept(student);
		}
	}
}
