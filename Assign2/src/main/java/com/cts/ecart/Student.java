package com.cts.ecart;

public class Student {

	public String studentNmae;
	public int studentAge;
	
	public Student() {
		
	}
	
	public Student(String studentnmae, int studentage) {
		studentNmae = studentnmae;
		studentAge = studentage;
	}
	
	public String getStudentNmae() {
		return studentNmae;
	}
	
	public void setStudentNmae(String studentNmae) {
		this.studentNmae = studentNmae;
	}
	
	public int getStudentAge() {
		return studentAge;
	}
	
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	
	@Override
	public String toString() {
		return "Class [studentNmae=" + studentNmae + ", studentAge=" + studentAge + "]";
	}
	
	
}
