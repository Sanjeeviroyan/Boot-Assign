package com.cts.ecart.Services;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import com.cts.ecart.Module.StudentModule;

import jakarta.annotation.PreDestroy;

@Service
public class StudentService {  //implements InitializingBean , DisposableBean {

	//Create a Student in Map
	public void CreateStudent(HashMap<Integer, StudentModule> studentList) { 
		
		studentList.put( 1,new StudentModule("Akilan",01, 90));
		studentList.put( 2,new StudentModule("Bhuvi",02, 80));
		studentList.put( 3,new StudentModule("Chan",03, 70));
		studentList.put( 4,new StudentModule("Dani",04, 50));
		System.out.println(studentList);
		
		}
	
	//Fetch all Student
	public void StudentsDetails(HashMap<Integer, StudentModule> studentList) {
		
		System.out.println(studentList);
		
	}

	//Fetch a Student By Key in Map
	public void StudentByKey(HashMap<Integer, StudentModule> studentList) {
		
		StudentModule studentdetails = studentList.get(1);
		System.out.println(studentdetails);
		
	}

	//Update the student Detail in Map
	public void UpdateStudent(HashMap<Integer, StudentModule> studentList) {
		
		StudentModule updatestudent = studentList.replace(1,new StudentModule("Akilan",05,50) );
		System.out.println(updatestudent);
		System.out.println(studentList);
		ScoreSystem(studentList);
	}
	
	//Delete a student from Map
	public void DeleteStudent(HashMap<Integer, StudentModule> studentList) {
	
		StudentModule deletedstudent = studentList.remove(3);
		System.out.println(studentList);

	}
	
//	public void init() throws Exception {
//		System.out.println("the StudentService has been initialized");
//	}
//	
//	public void destroy() throws Exception {
//		System.out.println("the StudentService has been Destroy");
//	}
	
	//Scoring System
	public void ScoreSystem(HashMap<Integer, StudentModule> studentList) {
		
		for (Entry<Integer, StudentModule> loop : studentList.entrySet()) {
			StudentModule ii= loop.getValue();
			if (ii.getScore() <= 50) {
				System.out.println("the student is Below Average => " +ii);	
				}
			else if (ii.getScore() > 50 && ii.getScore() < 75) {
				System.out.println("the student is Average => " +ii);
			}
			else if (ii.getScore() > 75) {
				System.out.println("the student is Above Average => " +ii);
			}
		}
		
	}
	
	
	
	

}



