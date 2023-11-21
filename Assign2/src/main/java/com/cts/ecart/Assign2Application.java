package com.cts.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Assign2Application {

	public static void main(String[] args) {
		SpringApplication.run(Assign2Application.class, args);
	}
	
	@Bean
	public Book book() {
		return new Book("A1","Sanjeevi");
	}
	
	@Bean
	public Library library(Book book) {
		return new Library(book);
	}
	
	@Bean
	public Student student() {
		return new Student("Sanjeevi",25);
	}
	
	@Bean
	public Classroom classroom(Student student) {
		return new Classroom(student);
	}
}
