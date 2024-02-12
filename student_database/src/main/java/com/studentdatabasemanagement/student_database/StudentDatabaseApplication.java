package com.studentdatabasemanagement.student_database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentdatabasemanagement.student_database.entity.Student;
import com.studentdatabasemanagement.student_database.repository.StudentRepository;

@SpringBootApplication
public class StudentDatabaseApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentDatabaseApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Student student1 = new Student("Ram","Kumar","araj@gmail.com");
//		studentRepository.save(student1);
//		Student student2 = new Student("Rm","Kar","aj@gmail.com");
//		studentRepository.save(student2);
//		Student student3 = new Student("Ramesh","Kr","j@gmail.com");
//		studentRepository.save(student3);
////		
	}

}
