package com.company.educationsystem.elc;
import java.util.*;

import com.company.educationsystem.blc.Course;
import com.company.educationsystem.blc.EducationInstitute;
import com.company.educationsystem.blc.Offer;
import com.company.educationsystem.blc.Student;
public class StudentEnrollmentProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//Courses
		Course course1=new Course(1,"Java",35000.00);
		Course course2=new Course(2,".Net",30000.00);
		Course course3=new Course(3,"Python",32000.00);
		Course course[]= {course1,course2,course3};
		//Offer
		Offer offer1=new Offer("Special discount: Get 20% off on all courses!");
		Offer offer2=new Offer("Limited time offer: Enroll in any two courses and get one course free!");
		Offer offer[]= {offer1,offer2};
		//EducationInstitute
		EducationInstitute educationinstitute=new EducationInstitute(course,offer);
		//StudentsMnagement
		System.out.println("Enter student name: ");
		String name=sc.nextLine();
		Student student=new Student(name,educationinstitute);
		student.viewCoursesAndFees();
		student.viewOffers();
		System.out.println("Enter course ID to enroll:");
		int id=sc.nextInt();
		
		student.enrollInCourse(id);
		
	}

}
