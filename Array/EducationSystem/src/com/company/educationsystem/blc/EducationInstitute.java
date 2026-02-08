package com.company.educationsystem.blc;

public record EducationInstitute(Course[] courses,Offer []offers) {
	
	public void enrollStudentInCourse(int courseId,String studentName) {
		for(int i=0;i<courses.length;i++) {
			if(courses[i].id()==courseId) {
				System.out.println(studentName+" enrolled in: "+courses[i].name());
			}
		}
	}

}
