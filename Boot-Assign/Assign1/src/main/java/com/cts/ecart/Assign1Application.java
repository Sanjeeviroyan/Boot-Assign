package com.cts.ecart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cts.ecart.Module.StudentModule;
import com.cts.ecart.Services.StudentService;


@SpringBootApplication
public class Assign1Application {

	public static void main(String[] args) {
		
		HashMap<Integer, StudentModule> studentList = new HashMap<Integer, StudentModule>();
		StudentService studentService = new StudentService();
		studentService.CreateStudent(studentList);
		studentService.StudentsDetails(studentList);
		studentService.StudentByKey(studentList);
		studentService.UpdateStudent(studentList);
		//studentService.DeleteStudent(studentList);
		//studentService.ScoreSystem(studentList);
		
	

}
}
