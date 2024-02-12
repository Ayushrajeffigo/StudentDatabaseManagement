package com.studentdatabasemanagement.student_database.service;
// first is to create a interface then start defining the methods like Select * 

import java.util.List;

import com.studentdatabasemanagement.student_database.entity.Student;


public interface StudentService {
	List<Student> getAllStudents(); //method is there for getting all students
	Student saveStudent(Student student);
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	void deleteStudentById(Long id);

}
