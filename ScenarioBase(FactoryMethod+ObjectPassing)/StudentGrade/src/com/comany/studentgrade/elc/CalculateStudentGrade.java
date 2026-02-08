package com.comany.studentgrade.elc;

public class CalculateStudentGrade {
	public static StudentGrade calculateGrade(Student student){
		int marks=student.getMarks();
		if(marks>90) {
			return new StudentGrade(student,'A');
		} 
		else if(marks>=75) {
			return new StudentGrade(student,'B');
		} 
		else if(marks>=60) {
			return new StudentGrade(student,'A');
		} 
		else {
				return new StudentGrade(student,'A');
		}
	}
}
