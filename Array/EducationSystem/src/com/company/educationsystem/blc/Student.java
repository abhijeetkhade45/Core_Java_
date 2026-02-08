package com.company.educationsystem.blc;

public record Student(String name,EducationInstitute educationinstitute) {
	public void viewCoursesAndFees() {
		for(int i=0;i<educationinstitute.courses().length;i++) {
			System.out.print(educationinstitute.courses()[i].id()+" : ");
			System.out.print(educationinstitute.courses()[i].name()+" : ");
			System.out.print(educationinstitute.courses()[i].fee());
			System.out.println();
		}
	}
	 public void viewOffers() {
			for(int i=0;i<educationinstitute.offers().length;i++) {
				System.out.println(educationinstitute.offers()[i].offerText());
			}
		}
	 public void enrollInCourse(Integer id) {
		 boolean b=true;
		 for(int i=0;i<educationinstitute.courses().length;i++) {
			 if(id==educationinstitute.courses()[i].id()) {
				 b=false;
				 educationinstitute.enrollStudentInCourse(id,name);
				 
			 }
		 }
		 if(b) {
			 System.out.println("Course with ID "+ id +" not found.");
		 }
	 }
}
