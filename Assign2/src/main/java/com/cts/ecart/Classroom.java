package com.cts.ecart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Classroom {

	@Autowired
	public Student student;
	
//	public Classroom(String studentNmae, int studentAge) {
//		student.studentNmae = studentNmae;
//		student.studentAge = studentAge;
//	}
	
	public Classroom(Student student) {
		this.student = this.student;
	}
	
	public void displayStudentDetails() {
		System.out.println(student.toString());
	}
	
}
