package com.comany.studentgrade.elc;

public class StudentGrade {
	private Student student;
	private char grade;
	public StudentGrade(Student student, char grade) {
		super();
		this.student = student;
		this.grade = grade;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "StudentGrade [student=" + student + ", grade=" + grade + "]";
	}
	
}
