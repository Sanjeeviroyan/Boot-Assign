package com.cts.ecart.Module;

import org.springframework.stereotype.Component;

@Component
public class StudentModule {
	
	private String Name;
	private int RollNO;
	private int Score;
	
	public StudentModule() {
	}
	
	public StudentModule(String name,int rollno,int score) {
		this.Name=name;
		RollNO=rollno;
		Score=score;
	}	
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public int getRollNO() {
		return RollNO;
	}
	
	public void setRollNO(int rollNO) {
		RollNO = rollNO;
	}
	
	public int getScore() {
		return Score;
	}
	
	public void setScore(int score) {
		Score = score;
	}
	
	@Override
	public String toString() {
		return Name +" "+ RollNO +" "+ Score;
	}
	
	public void UpdateFullStudent(String name, int rollno, int score) {
		this.Name=name;
		this.RollNO=rollno;
		this.Score=score;
	}

}
