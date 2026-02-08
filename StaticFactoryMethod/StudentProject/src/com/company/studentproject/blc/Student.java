package com.company.studentproject.blc;

public class Student {
	String name;
	int age;
	String grade;
	private Student(String name, int age, String grade) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	public static Student createStudentObject(String name,int age,String grade)
	{
		return new Student(name,age,grade);
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
	
}
